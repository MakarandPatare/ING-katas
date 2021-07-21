package part3

import scala.collection.mutable.ListBuffer
import scala.io.BufferedSource

case class TableRow(team: String, goalsFor: Int, goalsAgainst: Int) extends Ordered[TableRow]{ tr =>
  override def compare(that: TableRow): Int =
    getAbsoluteGoalDifference compareTo that.getAbsoluteGoalDifference

  def getAbsoluteGoalDifference: Int = {
    Math.abs(tr.goalsFor - tr.goalsAgainst)
  }
}

object Football {

  private val relevantRowRegex = raw"\s*\d+.\s*[a-zA-Z]+(\s+\d+){5}\s+-(\s+\d+){2}"
  private val teamNameRegex = "[a-zA-Z]+".r
  private val goalsForAndAgainstRegex = raw"(\d+\s+-\s+\d+)".r

  def getTeamWithSmallestGoalDifference(filePath: String): List[TableRow] = {
    val eplResults = extractEplResultsFromFile(filePath: String)

    val sortedResults = eplResults.sorted
    val minGoalDifference = sortedResults.head.getAbsoluteGoalDifference

    sortedResults.takeWhile(t => t.getAbsoluteGoalDifference == minGoalDifference)
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
