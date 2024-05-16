import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.functions;


public class DataProcessor {
    public static void main(String[] args) {
        SparkSession spark = SparkSession.builder()
                .appName("SparkJob1")
                .getOrCreate();

        // Đọc file Parquet từ HDFS
        Dataset<Row> df = spark.read().parquet("hdfs:/data.parquet");

        // Chuyển đổi cột 'Ngày sinh' thành định dạng ngày và tính tuổi
        df = df.withColumn("Ngày sinh", functions.to_date(df.col("Ngày sinh"), "yyyy-MM-dd"));
        df = df.withColumn("Tuổi", functions.expr("year(current_date()) - year(`Ngày sinh`)"));

        // Nhóm theo độ tuổi và giới tính
        df = df.withColumn("Nhóm tuổi",
                functions.when(df.col("Tuổi").lt(10), "0-10")
                        .when(df.col("Tuổi").geq(10).and(df.col("Tuổi").lt(20)), "10-20")
                        .when(df.col("Tuổi").geq(20).and(df.col("Tuổi").lt(30)), "20-30")
                        .when(df.col("Tuổi").geq(30).and(df.col("Tuổi").lt(40)), "30-40")
                        .when(df.col("Tuổi").geq(40).and(df.col("Tuổi").lt(50)), "40-50")
                        .when(df.col("Tuổi").geq(50).and(df.col("Tuổi").lt(60)), "50-60")
                        .when(df.col("Tuổi").geq(60).and(df.col("Tuổi").lt(70)), "60-70")
                        .when(df.col("Tuổi").geq(70).and(df.col("Tuổi").lt(80)), "70-80")
                        .when(df.col("Tuổi").geq(80).and(df.col("Tuổi").lt(90)), "80-90")
                        .when(df.col("Tuổi").geq(90).and(df.col("Tuổi").lt(100)), "90-100")
                        .otherwise("100+"));

        Dataset<Row> result = df.groupBy("Nhóm tuổi", "Giới tính").count();
        result.write().parquet("hdfs:/resultjob1.parquet");

        spark.stop();
    }
}
