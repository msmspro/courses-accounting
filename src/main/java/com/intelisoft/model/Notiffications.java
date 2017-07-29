package com.intelisoft.model;

import java.sql.Date;
import java.util.List;

public class Notiffications extends Model{

	private static final long serialVersionUID = 5734793146922815304L;

	private Date noticeDateTime;
	private String message;
	private NotifficationTypes type;
	private List<Users> users;
	private Statuses status;

}
