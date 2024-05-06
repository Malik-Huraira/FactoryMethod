/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author Malikhuraira
 */
public class SquareGeometry extends Geometry{

	@Override
	public Shape createShape() {
		return new Square();
	}

}
