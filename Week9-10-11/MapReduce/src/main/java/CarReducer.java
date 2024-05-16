import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class CarReducer extends Reducer<Text, IntWritable, Text, LongWritable> {

    public CarReducer() {

    }

    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {

        long sum = 0;

        for (IntWritable occurrence : values) {
            sum += occurrence.get();
        }

        context.write(key, new LongWritable(sum));
    }
}
