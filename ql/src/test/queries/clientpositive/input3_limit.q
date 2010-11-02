DROP TABLE T1;
CREATE TABLE T1(key STRING, value STRING) STORED AS TEXTFILE;
LOAD DATA LOCAL INPATH '../data/files/kv1.txt' INTO TABLE T1;
LOAD DATA LOCAL INPATH '../data/files/kv2.txt' INTO TABLE T1;

DROP TABLE T2;
CREATE TABLE T2(key STRING, value STRING);

EXPLAIN 
INSERT OVERWRITE TABLE T2 SELECT * FROM (SELECT * FROM T1 DISTRIBUTE BY key SORT BY key, value) T LIMIT 20;

INSERT OVERWRITE TABLE T2 SELECT * FROM (SELECT * FROM T1 DISTRIBUTE BY key SORT BY key, value) T LIMIT 20;

SELECT * FROM T2 SORT BY key, value;

DROP TABLE T1;
DROP TABLE T2;
