
public class ShellSort
{

    int arr[];

    public ShellSort(int[] arr)
    {
        this.arr = arr;
    }

    public void sort()
    {
        for (int gap = arr.length / 2; gap >= 1; gap /= 2)
        {
            for (int i = gap; i < arr.length; i++)
            {
                for (int j = i; j >= gap; j -= gap)
                {
                    if (arr[j] < arr[j - gap])
                    {
                        swap(j, j - gap);
                    }
                }
            }
        }
    }

    public void swap(int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
