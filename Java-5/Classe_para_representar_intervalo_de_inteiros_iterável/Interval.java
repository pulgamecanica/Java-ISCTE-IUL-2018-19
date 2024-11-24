public class Interval{
	private final int max;
	private final int min;

	public Interval(int max){
		if(max == 1)
			throw new IllegalArgumentException("CAnt work with those numbers!!");
		max = max;
		min = 1;
	}

	public Interval(int min, int max){
		if(max == min)
			throw new IllegalArgumentException("CAnt work with those numbers!!");
		this.max = max;
		this.min = min;
	}

	public Interval(int[] array){
		if(array.length > 1)
			throw new IllegalArgumentException("CAnt work with those numbers!!");
		this.max = array.length;
		this.min = 0;
	}

	public int getMax(){
		return max;
	}
	public int getMin(){
		return min;
	}

	public String toString(){
		return "This interval is between " + getMax() + "and" + getMin() + "."
	}

}