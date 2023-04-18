package DemoPackage;

import DemoTests.AnotherDemoClasstoCheckExtendKeyword;

public class understandPackages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//so in order to access the methods of class from other package in this package we need to import the package as shown in this class.
		AnotherDemoClasstoCheckExtendKeyword ab =  new AnotherDemoClasstoCheckExtendKeyword();
		ab.checkExtendKeyword();
		
	}

}
