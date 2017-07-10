package LEC0115;

public class RandomStringChooser {

	private int _size;
	private String[] _arr;
	private int _ptr;

	public RandomStringChooser(String[] arr) {
		_arr = arr;
		_size = arr.length;
		_ptr = 0;
	}

	public String getNext() {

		if (_ptr < _size) {
			return _arr[_ptr++];
		} else {
			return "NONE";
		}
	}
}
