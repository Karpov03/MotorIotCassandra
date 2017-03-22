package com.megatech.model;

import java.util.Date;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "motortimedata")
public class MotorTimeData {

	@PrimaryKeyColumn(name = "timestamps", type = PrimaryKeyType.PARTITIONED)
	private Date timestamps;

	@PrimaryKeyColumn(name = "tagid")
	private String tagid;

	@PrimaryKeyColumn(name = "value")
	private float value;

	public MotorTimeData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getTimestamps() {
		return timestamps;
	}

	public void setTimestamps(Date timestamps) {
		this.timestamps = timestamps;
	}

	public String getTagid() {
		return tagid;
	}

	public void setTagid(String tagid) {
		this.tagid = tagid;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public MotorTimeData(Date timestamps, String tagid, float value) {
		super();
		this.timestamps = timestamps;
		this.tagid = tagid;
		this.value = value;
	}


}
