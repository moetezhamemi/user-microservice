package com.moetez.users.security;

public interface SecParams {
	public static final String PREFIX = "Bearer ";
	public static final long EXP_TIME = 10*24*60*60*1000;
	public static final String SECRET = "moetez@gmail.com";
}