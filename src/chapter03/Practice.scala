package chapter03

import scala.util._
import scala.collection.mutable.ArrayBuffer
import java.awt.datatransfer._
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.Buffer

object Practice {

	def main(args: Array[String]) {
		val result = randomArray(10);

		println(result.length);
		for(i <- result) {
			println(i);
		}

		changeArray(Array(1,2,3,4,5));

		val origin = Array(1,2,3,4,5,6,7,8,9,10);
		val newArr = (for(i <- 0 until origin.length) yield {
			if(i%2 == 1){
				origin(i-1);
			} else if (i != (origin.length - 1)) {
				origin(i + 1)
			} else {
				origin(i)
			}
		}).toArray;

		println("origin : " + origin.toBuffer);
		println("newArr : " + newArr.toBuffer);
		
		val arr2 = Array(10, -9, 8, -7, -6, 5, 7, 8, 0, -10, 0);
		var newArr2 = new ArrayBuffer[Int]();
		
		newArr2 ++= (for(i<-0 until arr2.length if arr2(i) > 0) yield arr2(i));
		newArr2 ++= (for(i<-0 until arr2.length if  arr2(i) <= 0) yield arr2(i));
		
		println(newArr2.toBuffer);
		
		val doubles = Array(3.3,5.3,8.3,1.2,6.7);
		val average = doubles.sum/doubles.length;
		println(average);
		
		val arr3 = Array(10,7,4,5,8,2,3,6,1,9).sorted.reverse;
		val arr4 = ArrayBuffer(10,7,4,5,8,2,3,6,1,9).sorted.reverse;
		println(arr3.toBuffer);
		println(arr4.toBuffer);
		
		for(i <- (0 until arr3.length).reverse) print(arr3(i) + " ");
		
		println();
		val arr5 = Array(1,2,3,2,4,5,6,7,5,8,9,7,2,10,10);
		val arr6 = arr5.distinct;
		println(arr6.toBuffer);
		
		 
		val americas = for (timeZone <- java.util.TimeZone.getAvailableIDs if timeZone startsWith "America") yield timeZone.replaceFirst("America/", "");
		println("America : " + americas.toBuffer);
		
		val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
		val imageFlavors : Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
		println("ImageFlavors : " + imageFlavors)
	}

	def randomArray(n: Int) = {
		// (for(i <- 0 until n) yield Random.nextInt(n)).toArray	   
		var arr = new Array[Int](n);
		for(i <- 0 until n){
			arr(i) = Random.nextInt;
		} 

		arr
	}

	def changeArray(arr: Array[Int]) = {
		for(i <- 1 until (arr.length, 2)){
			val temp = arr(i);
			arr(i) = arr(i-1);
			arr(i-1) = temp;
		}
	}
}