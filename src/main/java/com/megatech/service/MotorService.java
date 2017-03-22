package com.megatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.megatech.model.MotorTimeData;
import com.megatech.repo.CassandraRepo;

@Service
public class MotorService {

	@Autowired
	CassandraRepo cassandraRepo;

	@Transactional
	public Iterable<MotorTimeData> getTag(List<String> tagid) {
		return cassandraRepo.findByTagid(tagid);
	}

	@Transactional
	public Iterable<MotorTimeData> getTagByDate(List<String> tagid,Long startdate,Long enddate) {
		return cassandraRepo.findByTagidInAndTimestamps(tagid, startdate, enddate);
	}

	@Transactional
	public Iterable<MotorTimeData> getTimeData() {
		return cassandraRepo.findAll();
	}

}