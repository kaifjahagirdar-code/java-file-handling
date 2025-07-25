package com.cc.serialization;

import java.io.Serializable;

public class User implements Serializable {

		private int userId;
		private String userName;
		transient private String password;
		public User(int userId, String userName, String password) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.password = password;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
		}
		
		
        
	}


