package com.megatech.repo;

import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.megatech.model.MotorTimeData;

@org.springframework.stereotype.Repository
public interface CassandraRepo extends CrudRepository<MotorTimeData,Long> {

	@Query("select * from motortimedata where tagid in(?0)")
    Iterable<MotorTimeData> findByTagid(List<String> tagid);

	@Query("SELECT * FROM motortimedata WHERE tagid IN (?0) AND timestamps >= ?1 AND timestamps <=?2")
    Iterable<MotorTimeData> findByTagidInAndTimestamps(List<String> tagid,Long startTime, Long endTime);

	
}