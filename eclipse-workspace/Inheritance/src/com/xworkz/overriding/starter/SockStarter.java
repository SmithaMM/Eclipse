package com.xworkz.overriding.starter;

import com.xworkz.overriding.Material;
import com.xworkz.overriding.Sock;
import com.xworkz.overriding.TypeSock;

public class SockStarter {

	public static void main(String[] args) {

		Sock sock = new Sock();
		sock.setMaterial(Material.COTTON);
		sock.setPrice(250);
		sock.setSize("small");
		sock.setType(TypeSock.ANKLE);

		Sock sock1 = new Sock();
		sock1.setMaterial(Material.NYLON);
		sock1.setPrice(250);
		sock1.setSize("small");
		sock1.setType(TypeSock.ANKLE);

		sock.equals(sock1);

	}

}
