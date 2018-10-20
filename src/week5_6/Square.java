// class word
import java.util.Scanner;

public class Word
{
	public String word;
	public String mean;
	public String type;
	public int STT;

	// ham tao
	public Word()
	{

	}

	// ham tao co tham so
	public Word(int STT,String word, String mean, String type)
	{
		this.STT = STT;
		this.word = word;
		this.mean= mean;
		this.type = type;

	}

	public void displayWord()
	{

		System.out.printf("\n|%-20s|%-38s|%-17s|",word,mean,type);
		System.out.printf("\n|-----------------------------------------------------------------------------|");

	}
}
