import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.ReduceDriver;
import org.apache.hadoop.mrunit.mapreduce.MapDriver;
import org.junit.Test;


import java.io.IOException;
import java.util.Arrays;

public class TestCarReducer {

    public static void main(String[] args) throws IOException {
        (new TestCarReducer()).testReducer();
    }


    @Test
    public void testReducer() throws IOException {

        ReduceDriver<Text, IntWritable, Text, LongWritable> driver =
                ReduceDriver.<Text, IntWritable, Text, LongWritable>newReduceDriver()
                        .withReducer(new CarReducer())
                        .withInput(new Text("bmw"), Arrays.asList(new IntWritable(1), new IntWritable(1)))
                        .withInput(new Text("toyota"), Arrays.asList(new IntWritable(1)))
                        .withInput(new Text("rolls-royce"), Arrays.asList(new IntWritable(1)))
                        .withInput(new Text("honda"), Arrays.asList(new IntWritable(1), new IntWritable(1)))
                        .withOutput(new Text("bmw"), new LongWritable(2))
                        .withOutput(new Text("toyota"), new LongWritable(1))
                        .withOutput(new Text("rolls-royce"), new LongWritable(1))
                        .withOutput(new Text("honda"), new LongWritable(2))
                ;
        driver.runTest();
    }
}
