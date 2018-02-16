package com.lumeris.dataplatform.hackathon_spark_batch;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lumeris.dataplatform.spark.batch.SparkBatchApplication;

/**
 * The Driver for Spark Batch Workflows!
 *
 */
@SpringBootApplication
public class HackathonSparkBatchApplication {

    /**
     * The Main Methods Loads the Spring Context built in Spark-Core via @SparkBatchApplication
     * The master.yaml determines what in the workflow runs!
     * @param args
     */
    public static void main(String[] args) {
        SparkBatchApplication.run(HackathonSparkBatchApplication.class, args);
    }

}
