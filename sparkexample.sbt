name := "SparkExmple Project"
 
version := "1.0"

scalaVersion := "2.11.8"
 
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.2.1" 
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.0.0"
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka" % "1.6.3"
libraryDependencies += "org.apache.spark" %% "spark-streaming-flume" % "2.1.0"
libraryDependencies += "org.apache.spark" %% "spark-streaming-flume-sink" % "2.1.0"
libraryDependencies += "org.apache.spark" %% "spark-streaming-kinesis-asl-assembly" % "2.0.0"
libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "2.0.0-M3"
libraryDependencies += "org.apache.spark" %% "spark-streaming-twitter" % "1.6.3"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.0.0"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.1.0"


libraryDependencies += "com.google.code.gson" % "gson" % "2.3.1" 


EclipseKeys.withSource := false
EclipseKeys.withJavadoc := false
