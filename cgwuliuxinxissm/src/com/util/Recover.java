package com.util;

import java.io.*;
import java.lang.*;

/*   
 * ��ԭMySql���ݿ�   
 * */
public class Recover {
	public boolean load() {
		String filepath = "d:\\jxc.sql"; // ���ݵ�·����ַ
		// �½����ݿ�test

		String stmt1 = "mysqladmin -u root -proot create jxctest";

		String stmt2 = "mysql -u root -proot jxctest < " + filepath;
		String[] cmd = { "cmd", "/c", stmt2 };

		try {
			Runtime.getRuntime().exec(stmt1);
			Runtime.getRuntime().exec(cmd);
			System.out.println("�����Ѵ� " + filepath + " ���뵽���ݿ���");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
}