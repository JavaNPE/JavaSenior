package com.youliao.strategyPattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author Dali
 * @Date 2022/4/20 16:20
 * @Version 1.0
 * @Description
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Dish {

	private String name;
	private Boolean vegitarian;
	private Integer calaries;
	private Type type;


	public Boolean getVegitarian() {
		return vegitarian;
	}

	public void setVegitarian(Boolean vegitarian) {
		this.vegitarian = vegitarian;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public enum Type { MEAT, FISH, OTHER };
}
