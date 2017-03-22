select * from motortimedata where tagid in ('100','101','109')

SELECT * FROM motortimedata where tagid in ('100','101','109','104','105') AND timestamps >= 1487034300000 AND timestamps <=1488225900000;

CREATE TABLE energydata.motortimedata (
	timestamps timestamp,
	value float,
	tagid text,
	PRIMARY KEY (tagid,timestamps)
);


INSERT INTO motortimedata(tagid, timestamps, value) VALUES ('104', '2017-02-14 06:35:00', 4820.0);
INSERT INTO motortimedata(tagid, timestamps, value) VALUES ('103', '2017-02-16 01:05:00', 3630.0);
INSERT INTO motortimedata(tagid, timestamps, value) VALUES ('106', '2017-02-16 01:05:00', 6390.0);
INSERT INTO motortimedata(tagid, timestamps, value) VALUES ('102', '2017-02-26 02:21:40', 17.0);
INSERT INTO motortimedata(tagid, timestamps, value) VALUES ('100', '2017-02-14 12:06:00', 2536.37);
INSERT INTO motortimedata(tagid, timestamps, value) VALUES ('108', '2017-02-16 01:05:00', 8500.0);
INSERT INTO motortimedata(tagid, timestamps, value) VALUES ('107', '2017-02-28 01:35:00', 3600.0);
INSERT INTO motortimedata(tagid, timestamps, value) VALUES ('105', '2017-02-16 01:05:00', 5500.0);
INSERT INTO motortimedata(tagid, timestamps, value) VALUES ('109', '2017-02-14 06:35:00', 9320.0);
INSERT INTO motortimedata(tagid, timestamps, value) VALUES ('101', '2017-02-16 12:05:00', 73.0);
