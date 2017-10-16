package twostackonearray;

public class stack {
	int afront=-1;
	int arear=-1;
	int arr[] = new int[10];
	int bfront=-1;
	int brear=-1;
	public void inserta(int item)
	{
		if (afront == arear)
		{
			if (afront == -1)
			{
				afront = 0;
			}
		}
		if (arear + 1 == bfront)
		{
			System.out.println("Stack is full");
			return;
		}
		arear = arear + 1;
		arr[arear] = item;
	}
	public void insertb(int item)
	{
		if (brear == bfront)
		{
			if (bfront == -1)
			{
				bfront = arr.length - 1;
			}
		}
		if (brear - 1 == arear)
		{
			System.out.println("Stack is full");
			return;
		}
		brear = brear - 1;
		arr[brear] = item;
	}
	public void removea()
	{
		if (arear - 1 < 0)
		{
			System.out.println("Stack is Empty");
			return;
		}
		arear = arear - 1;
	}
	public void removeb()
	{
		if (brear + 1 > arr.length)
		{
			System.out.println("Stack is Empty");
		}
		brear = brear + 1;
	}
}
