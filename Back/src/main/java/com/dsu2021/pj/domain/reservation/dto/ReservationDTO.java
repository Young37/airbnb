package com.dsu2021.pj.domain.reservation.dto;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class ReservationDTO {
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ReservationRes{
		private Long reservationindex;
		private Long userIndex;
		private Long roomIndex;
		private String reservationState;
		private int reservationPrice;
		private Date checkinDate;
		private Date checkoutDate;
		private Date reservationDate;
	}
	
	
}
