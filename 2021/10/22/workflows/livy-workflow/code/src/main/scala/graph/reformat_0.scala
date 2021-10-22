package graph

import io.prophecy.libs._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import config.ConfigStore._
import udfs.UDFs._
import udfs._

object reformat_0 {

  def apply(spark: SparkSession, in: DataFrame): DataFrame =
    in.select(col("customer_id"))

}
