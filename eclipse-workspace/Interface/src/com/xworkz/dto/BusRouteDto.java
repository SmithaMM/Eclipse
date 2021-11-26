package com.xworkz.dto;

public class BusRouteDto {
int ID;
String START_POINT;
String DESTINATIN;
String DRIVER_NAME;

public int getID() {
	return ID;
}
public String getSTART_POINT() {
	return START_POINT;
}
public String getDESTINATIN() {
	return DESTINATIN;
}
public String getDRIVER_NAME() {
	return DRIVER_NAME;
}
public void setID(int iD) {
	ID = iD;
}
public void setSTART_POINT(String sTART_POINT) {
	START_POINT = sTART_POINT;
}
public void setDESTINATIN(String dESTINATIN) {
	DESTINATIN = dESTINATIN;
}
public void setDRIVER_NAME(String dRIVER_NAME) {
	DRIVER_NAME = dRIVER_NAME;
}
}
