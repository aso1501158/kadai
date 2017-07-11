package model;

import java.io.Serializable;

public class Student implements Serializable{

	private int Stu_id;
	private String Stu_password;
	private String Stu_name;
	private int flag;
	public int getStu_id() {
		return Stu_id;
	}
	public void setStu_id(int stu_id) {
		Stu_id = stu_id;
	}
	public String getStu_password() {
		return Stu_password;
	}
	public void setStu_password(String stu_password) {
		Stu_password = stu_password;
	}
	public String getStu_name() {
		return Stu_name;
	}
	public void setStu_name(String stu_name) {
		Stu_name = stu_name;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
}
