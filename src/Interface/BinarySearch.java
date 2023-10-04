package Interface;

import java.util.Arrays;
import java.util.Iterator;

public class BinarySearch implements Arrange {

	@Override
	public int Search(int[] arr, int key) {

		Arrays.sort(arr); 

		int l = arr[0], r = arr.length - 1;

		while (l <= r) {
			int m = l + (r - l) / 2;

			// kiểm tra xem x có ở chính giữa không
			if (arr[m] == key)
				return m;

			// Nếu x lớn hơn, bỏ qua nửa bên trái
			if (arr[m] < key)
				l = m + 1;

			// Nếu x nhỏ hơn, bỏ qua nửa bên phải
			else
				r = m - 1;
		}

		// phần tử không tồn tại
		return -1;
	}

}
