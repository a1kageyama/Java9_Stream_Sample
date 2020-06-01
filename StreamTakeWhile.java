import java.util.stream.Stream;

public class StreamTakeWhile {

	public static void main(String[] args) {

		Stream<Integer> numStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
							11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
							1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// From top of the list, target the value that satisfies the condition
		numStream.takeWhile(b -> {
			if (0 <= b && b <= 10) {
				return true;
			}
			else{
				return false;
			}
		}).forEach(System.out::println);

	}
}

//============================================
//               Output Sample
//============================================

// $ javac StreamTakeWhile.java
// $ java StreamTakeWhile
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10

//============================================
