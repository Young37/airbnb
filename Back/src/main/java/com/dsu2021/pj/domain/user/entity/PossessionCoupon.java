package com.dsu2021.pj.domain.user.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PossessionCoupon {
	private Long userIndex;
	private Long couponIndex;
	private int amount;
	private Date terminateDate;
}
