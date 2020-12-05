package com.mushroomstudios.applied_theory;

import com.mushroomstudios.applied_theory.Enums.Unit;
import com.mushroomstudios.applied_theory.constructors.Sphere;
import com.mushroomstudios.applied_theory.encapsulation.Cube;
import com.mushroomstudios.applied_theory.inheritance.CarbonCube;
import com.mushroomstudios.applied_theory.polymorphism.MetalCube;

/**
 * You can have more main methods for proyect, but you have to choose which run
 *
 */
public class App {
	/* you can try the classes here, print that you want! */
	public static void main(String[] args) {

		// encapsulation test
		Cube cube = new Cube();
		cube.material = "Wood";
		// you can't set cube weight through cube.weight because is a protected
		// attribute
		// you can't set cube height, width or deep through cube.height, cube.width
		// or cube.deep because is a protected attribute
		// so you have to use your mutators and accessors methods
		cube.setWeight(362.56);
		cube.setDeep(150);
		cube.setHeight(150);
		cube.setWidth(150);
		System.out.print(cube.toString());
		System.out.println(" "+cube.getCubeType());

		// inheritance test
		CarbonCube carbonCube = new CarbonCube();
		carbonCube.setDamaged(true);
		System.out.println("Carbon cube damage: " + carbonCube.isDamaged());

		// constructor test
		Sphere sphere = new Sphere(12.5f, Unit.CMS);
		System.out.println(sphere.toString());

		// polymorphism test
		MetalCube metalCube = new MetalCube();
		System.out.println(metalCube.getCubeType());
	}
}
