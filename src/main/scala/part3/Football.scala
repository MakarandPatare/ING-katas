package part3

import scala.collection.mutable.ListBuffer
import scala.io.BufferedSource

case class TableRow(team: String, goalsFor: Int, goalsAgainst: Int)

object Football {

  val filePath = "src/main/scala/part3/resources/football.dat"
  val relevantRowRegex = raw"\s*\d+.\s*[a-zA-Z]+(\s+\d+){5}\s+-(\s+\d+){2}"
  val teamNameRegex = "[a-zA-Z]+".r
  val goalsForAndAgainstRegex = raw"(\d+\s+-\s+\d+)".r

  def getTeamWithSmallestGoalDifference: String = {
    val eplResults = extractEplResultsFromFile(filePath: String)
    eplResults.minBy(e => Math.abs(e.goalsFor - e.goalsAgainst)).team
  }

  private def readFile(filePath: String): BufferedSource = {
    import scala.io.Source
    Source.fromFile(filePath)
  }

  private def extractEplResultsFromFile(filePath: String): List[TableRow] = {
    val source = readFile(filePath)
    val eplResults = ListBuffer[TableRow]()
    for (line <- source.getLines) {
      if (line.matches(relevantRowRegex)) {
        val teamName = (teamNameRegex findFirstIn line).get
        val goalsByAndAgainst = (goalsForAndAgainstRegex findFirstIn line).get.split("-").map(g => g.trim.toInt)
        val tableRow = TableRow(teamName, goalsByAndAgainst(0), goalsByAndAgainst(1))
        eplResults.append(tableRow)
      }
    }
    eplResults.toList
  }
}
