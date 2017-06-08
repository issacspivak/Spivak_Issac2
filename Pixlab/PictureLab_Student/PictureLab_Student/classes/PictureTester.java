/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
    public static void testonlyBlue()
  {
	Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.onlyBlue();
    beach.explore(); 
  }
  
  
  public static void testNegate()
  {
	Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore(); 
  }
  
  public static void testGreyscale()
  {
	Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.greyscale();
    beach.explore(); 
  }
  
  
   public static void fixUnderwater()
  {
	Picture water = new Picture("water.jpg");
    water.explore(); 
	water.fixUnderwater();
	water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRtLC()
  {
    Picture moto = new Picture("redMotorcycle.jpg");
    moto.explore();
    moto.mirrorVerticalRtLC();
    moto.explore();
  }
  
  public static void testMirrorVerticalRtL()
  {
    Picture moto = new Picture("redMotorcycle.jpg");
    moto.explore();
    moto.mirrorVerticalRtL();
    moto.explore();
  }
  
  public static void testMirrorVerticalRtL2()
  {
    Picture moto = new Picture("redMotorcycle.jpg");
    moto.explore();
    moto.mirrorVerticalRtL2();
    moto.explore();
  }
  
  public static void testD()
  {
	Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.D();
    beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  
  public static void testSnowmanMirror()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.snowmanMirror();
    snowman.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture gull = new Picture("seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testSpecialCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.specialCollage();
    canvas.explore();
  }
  
  
  public static void mySpecialCollage()
  {
    Picture canvas = new Picture("beach.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
	Picture swan = new Picture("swan.jpg");
	swan.greyscale();
	swan.edgeDetection2(10);
	swan.explore();
		
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
	testonlyBlue();
	//testNegate();
	testGreyscale();
	//fixUnderwater();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	testMirrorVerticalRtL();
	//testMirrorVerticalRtLC();
    //testMirrorVerticalRtL2();
	//testD();
	//testMirrorTemple();
	//testSnowmanMirror();
	//testMirrorGull();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
	//testSpecialCollage();
    //mySpecialCollage();
	//testCopy();
    //testEdgeDetection();
    testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}