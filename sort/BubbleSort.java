package sort;

public class BubbleSort {
	
	public static void sort(long[] arr){
		long temp=0;
		for(int i=0;i<arr.length-1;i++){			//���ѭ������ͷ��β
			for(int j=arr.length-1;j>i;j--){	//�ڲ�ѭ������ĩβ��ʼ�������Ƚϣ�С��ð��ǰ�棬ֱ����iΪֹ
				if(arr[j-1]>arr[j]){
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	
}