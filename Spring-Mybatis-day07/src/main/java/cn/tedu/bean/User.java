package cn.tedu.bean;

import java.io.Serializable;

//ʵ����
public class User implements Serializable{
	/** ���кţ��汾�ţ�����ΪΨһ��ʶ
	 */
	private static final long serialVersionUID = -7895743789261693446L;
	private Integer id;
	private String username;
	private String password;
	private String phone;
	private String email;
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", phone=" + phone + ", email="
				+ email + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
}