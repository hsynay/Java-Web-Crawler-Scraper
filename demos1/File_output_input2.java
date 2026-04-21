package demos1;

import java.util.ArrayList;
import java.util.Scanner;

public class File_output_input2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
				
		java.io.File newFile = new java.io.File("Ustam");
		
		try (
				java.io.PrintWriter poem = new java.io.PrintWriter(newFile)
		) {
			
			poem.print("Ustam…\n"
					+ "Aklım firarda\n"
					+ "Gözbebeklerimde müebbet hüzün\n"
					+ "Dilimde ay kesiği bir yara\n"
					+ "Düşüm kırık dökük\n"
					+ "Umudumun boynu bükük\n"
					+ "Bir öksüzün omuzlarında sükut\n"
					+ "Yüreğim sana emanet ustam sıkı tut\n"
					+ "Tut ki; kancık pusulara düşmesin\n"
					+ "Bir hain kurşunu gelip deşmesin\n"
					+ "Ustam…\n"
					+ "Ustam ne zaman o senin bildiğin zaman\n"
					+ "Ne sevda gördüğün masallardaki\n"
					+ "Eskiden halı tezgahında dokunurdu aşklar\n"
					+ "Nakış nakış körpe kız ellerinde Şarkı Sözleri\n"
					+ "Mendillere yazılırdı isimler yüreklere kazılırdı gizlice\n"
					+ "Sevdalılar asil ve de yürekli\n"
					+ "Sevdalar kavgalar iki kişilik\n"
					+ "Oysa şimdi;\n"
					+ "Oysa şimdi çorak gönüllere ekiliyor sevdalar seher vakitlerinde\n"
					+ "Meşru sevdalardan gayrı meşru acılar doğuyor kundaklara\n"
					+ "O günahkar gecelerden\n"
					+ "Ustam…\n"
					+ "Ustam beni herkes sevdaya asi sanır\n"
					+ "Oysa aşk beni nerde görse tanır\n"
					+ "Hasret tanır zulüm tanır ölüm tanır\n"
					+ "Yüzüm yüzümden utanır ustam\n"
					+ "Yüzüm yüzümden utanır\n"
					+ "Yorgunum ustam yorgunum\n"
					+ "Ne katıksız somun isterim senden\n"
					+ "Ne bir tas su\n"
					+ "Ne taş yastıkta bir gece uykusu\n"
					+ "Var gücünle asıl şimdi sükunetime\n"
					+ "Çığlığım kopsun\n"
					+ "Uzat ellerini güneşe dokun\n"
					+ "Uyandır uykusundan\n"
					+ "Tut yüreğimden ustam tut\n"
					+ "Tut beni sür güne\n"
					+ "Tut beni sür güne");
			
			
			poem.close();
			
			Scanner poems = new Scanner(newFile);
			
			
			while(poems.hasNext()) {			
				String satır = poems.nextLine();
                System.out.println(satır);
                Thread.sleep(satır.length() * 125);

				
			}	
			
			
			System.out.println();	
			
			
			
			
			
			
		}catch(java.util.InputMismatchException ex) {
			System.out.println("Something went wrong OMFG :O)");
		}
		if (newFile.exists()) {
			System.out.println("File can exists");
			System.exit(0);
		}else {
			System.out.println("File can't exists");
		}


		
	}

}
