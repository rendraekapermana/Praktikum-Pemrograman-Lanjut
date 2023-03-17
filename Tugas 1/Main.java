import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan;

        // OBJEK TEKNOLOGI
        Buku teknologi1 = new Buku("The Art of Doing Science and Engineering: Learning to Learn", "Richard W. Hamming","Technology", "26 May 2020", "Stripe Press", "978-1732265172", "432", "2.1", "9.25", "6.25");
        Buku teknologi2 = new Buku("An Elegant Puzzle: Systems of Engineering Management", "Will Larson", "Technology","20 May 2019", "Stripe Press", "978-1732265189", "288", "1.59", "6", "9");
        Buku teknologi3 = new Buku("Professional Issues in Information Technology", "Frank Bott", "Technology","27 January 2014", "BCS, The Chartered Institute for IT", "978-1780171807", "209", "0.75", "6.69","9.61");
        Buku teknologi4 = new Buku("Computing and Technology Ethics: Engaging through Science Fiction","Emanuelle Burton", "Technology", "14 February 2023", "The MIT Press", "978-0262048064", "504", "2.15","8.2", "9.3");
        Buku teknologi5 = new Buku("The Story of NFTs: Artists, Technology, and Democracy", "Amy Whitaker","Technology", "7 March 2023", "Rizzoli Electa", "978-0847899364", "144", "1.2", "7.15", "11.24");

        // OBJEK FILSAFAT
        Buku filsafat1 = new Buku("The Cambridge History of Moral Philosophy", "Sacha Golob", "Philosophy", "16 February 2023", "Cambridge University Press", "978-1009364034", "764", "2.39", "6", "9");
        Buku filsafat2 = new Buku("Natural Philosophy: On Retrieving a Lost Disciplinary Imaginary", "Alister McGrath", "Philosophy", "10 February 2023", "Oxford University Press", "978-0192865731", "256", "1.2", "9.48", "6.41");
        Buku filsafat3 = new Buku("The Socratic Method: A Practitioner’s Handbook", "Ward Farnsworth", "Philosophy", "5 October 2021", "David R. Godine", "978-1567926859", "264", "1.2", "6.25", "9.25");
        Buku filsafat4 = new Buku("The Practicing Stoic: A Philosophical User's Manual", "Ward Farnsworth", "Philosophy", "1 April 2018", "David R. Godine", "978-1567926118", "256", "1.2", "6.2", "9.1");
        Buku filsafat5 = new Buku("Beyond Good and Evil", "Friedrich Nietzsche", "Philosophy", "6 November 2018", "CreateSpace Independent Publishing Platform", "978-1503250888", "116", "1.2", "6", "9");

        // OBJEK SEJARAH
        Buku sejarah1 = new Buku("Philosophy of Democratic Government (Charles R. Walgreen Foundation Lectures)", "Yves R. Simon", "History", "30 January 1993", "University of Notre Dame Press", "978-0268038038", "344", "0.9", "8.55", "5.56");
        Buku sejarah2 = new Buku("History of the World Map by Map", "Smithsonian Institution", "History", "23 October 2018", "DK", "978-1465475855", "440", "5.6", "10.31", "12.25");
        Buku sejarah3 = new Buku("History: From the Dawn of Civilization to the Present Day", "Smithsonian Institution", "History", "1 September 2015", "DK", "978-1465437976", "620", "6.9", "10.37", "12.25");
        Buku sejarah4 = new Buku("On This Day in History Sh!t Went Down", "James Fell", "History", "17 April 2021", "BFW Publishing", "978-1777574208", "393", "1.16", "6", "9");
        Buku sejarah5 = new Buku("Why Are They So Poor? Capitalism: A People's History", "David N.Singerman ", "History", "22 September 2021", "Amazon Pro Hub", "978-1503250888", "255", "0.8", "5.5", "8.5");
        
        // OBJEK AGAMA
        Buku agama1 = new Buku("God Is Not One: The Eight Rival Religions That Run the World", "Stephen Prothero", "Religious", "3 May 2011", "HarperOne", "978-0061571282", "400", "0.8", "5.31", "8");
        Buku agama2 = new Buku("Introduction to World Religions: Third Edition", "Christopher Partridge", "Religious", "1 May 2018", "Fortress Pres", "978-1506445946", "603", "2.8", "7.5", "9.2");
        Buku agama3 = new Buku("Religion Matters", "Stephen Prothero", "Religious", "1 July 2020", "W. W. Norton & Company", "978-0393422047", "640", "2.71", "8", "10");
        Buku agama4 = new Buku("The Psychedelic Origin of Religion", "Matthew Lawrence Weintrub", "Religious", "22 January 2023", "Independently published", "979-8373191289", "286", "0.8", "5.5", "8.5");
        Buku agama5 = new Buku("World Religions: The Great Faiths Explored and Explained", "John Bowker", "Religious", "12 October 2021", "DK", "978-0744034752", "352", "2.8", "7.81", "9.19");

        // OBJEK PSIKOLOGI
        Buku psikologi1 = new Buku("The Psychology Book: Big Ideas Simply Explained", "DK", "Psyhcology", "21 February 2017", "DK", "978-1465458568", "352", "2.1", "7.81", "9.19");
        Buku psikologi2 = new Buku("Psychology 2e Textbook (2nd Edition)", "Rose M. Spielman", "Psyhcology", "29 May 2022", "Independently published", "979-8832775142", "779", "3.73", "8", "10");
        Buku psikologi3 = new Buku("Psychology: A Complete Introduction", "Sandi Mann", "Psyhcology", "8 November 2016", "Teach Yourself", "978-1473609303", "400", "0.8", "5", "7.75");
        Buku psikologi4 = new Buku("Mindset: The New Psychology of Success", "Carol S. Dweck", "Psyhcology", "26 December 2007", "Ballantine Books", "978-0345472328", "320", "0.8", "5.2", "7.9");
        Buku psikologi5 = new Buku("The Psychology of Totalitarianism", "Mattias Desmet ", "Psyhcology", "23 June 2022", "Chelsea Green Publishing", "978-1645021728", "240", "1.25", "6", "9");

        // OBJEK POLITIK
        Buku politik1 = new Buku("I Swear: Politics Is Messier Than My Minivan", "Katie Porter  ", "Politic", "11 April 2023", "Crown", "978-0593443989", "304", "1.25", "5.8", "8.5");
        Buku politik2 = new Buku("The Politics Book: Big Ideas Simply Explained", "DK ", "Politic", "6 February 2018", "DK", "978-1465473905", "352", "2.7", "7.75", "9.25");
        Buku politik3 = new Buku("Aristotle's Politics: Second Edition", "Aristotle ", "Politic", "4 March 2013", "University of Chicago Press", "978-0226921846", "320", "1.06", "6", "9");
        Buku politik4 = new Buku("New York Politics: A Tale of Two States", "Edward V. Schneier ", "Politic", "15 March 2023", "Cornell University Press", "978-1501767272", "372", "1", "6", "9");
        Buku politik5 = new Buku("Respectable", "Grundy", "Politic", "16 August 2022", "University of California Press", "978-0520340398", "356", "1.1", "6", "9");

        // OBJEK FIKSI
        Buku fiksi1 = new Buku("All the Light We Cannot See: A Novel", "Anthony Doerr", "Fiction", "4 April 2017", "Scribner", "978-1501173219", "560", "1", "5.25", "8");
        Buku fiksi2 = new Buku("The Dictionary of Lost Words: A Novel", "Pip Williams", "Fiction", "3 May 2022", "Random House Publishing Group", "978-1984820747", "416", "0.8", "5.16", "7.94");
        Buku fiksi3 = new Buku("The Keeper of Happy Endings", "Barbara Davis", "Fiction", "1 October 2022", "Lake Union Publishing", "978-1542021470", "415", "1.1", "5.5", "8.25");
        Buku fiksi4 = new Buku("Home Front: A Novel", "Kristin Hannah", "Fiction", "8 November 2022", "St. Martin's Griffin", "978-1250858238", "432", "0.8", "5.35", "8.25");
        Buku fiksi5 = new Buku("Homecoming: A Novel", "Kate Morton", "Fiction", "4 April 2023", "Mariner Books", "978-0063020894", "560", "1.55", "6.4", "9.1");

        do {
            System.out.println("===== Welcome to E-Library =====");
            System.out.println("===== Book List =====");
            System.out.println("1. Technology Book");
            System.out.println("2. Philosophy Book");
            System.out.println("3. History Book");
            System.out.println("4. Religious Book");
            System.out.println("5. Psychology Book");
            System.out.println("6. Politic Book");
            System.out.println("7. Fiction Book");
            System.out.println("8. Keluar");
            System.out.print("Select the category of books you want to display (1-8): ");
            pilihan = input.nextLine();
            System.out.println(" ");

            switch (pilihan) {
                case "1":
                    System.out.println("===== Technology Category Book =====");
                    System.out.println("1. " + teknologi1.getJudul());
                    System.out.println("2. " + teknologi2.getJudul());
                    System.out.println("3. " + teknologi3.getJudul());
                    System.out.println("4. " + teknologi4.getJudul());
                    System.out.println("5. " + teknologi5.getJudul());
                    System.out.print("select the book you want to display (1-5): ");
                    String pilihanTeknologi = input.nextLine();
                    System.out.println(" ");
                    if (pilihanTeknologi.equals("1")) {
                        System.out.println(teknologi1);
                    } else if (pilihanTeknologi.equals("2")) {
                        System.out.println(teknologi2);
                    } else if (pilihanTeknologi.equals("3")) {
                        System.out.println(teknologi3);
                    } else if (pilihanTeknologi.equals("4")) {
                        System.out.println(teknologi4);
                    }  else if (pilihanTeknologi.equals("5")) {
                        System.out.println(teknologi5);
                    }
                     else {
                        System.out.println("invalid option please try again.");
                    }
                    break;
                case "2":
                    System.out.println("===== Philosophy Category Book =====");
                    System.out.println("1. " + filsafat1.getJudul());
                    System.out.println("2. " + filsafat2.getJudul());
                    System.out.println("3. " + filsafat3.getJudul());
                    System.out.println("4. " + filsafat4.getJudul());
                    System.out.println("5. " + filsafat5.getJudul());
                    System.out.print("select the book you want to display (1-5): ");
                    String pilihanFilsafat = input.nextLine();
                    System.out.println(" ");
                    if (pilihanFilsafat.equals("1")) {
                        System.out.println(filsafat1);
                    } else if (pilihanFilsafat.equals("2")) {
                        System.out.println(filsafat2);
                    } else if (pilihanFilsafat.equals("3")) {
                        System.out.println(filsafat3);
                    } else if (pilihanFilsafat.equals("4")) {
                        System.out.println(filsafat4);
                    } else if (pilihanFilsafat.equals("5")) {
                        System.out.println(filsafat5);
                    } else {
                        System.out.println("invalid option please try again.");
                    }
                    break;
                    case "3":
                    System.out.println("===== History Category Book =====");
                    System.out.println("1. " + sejarah1.getJudul());
                    System.out.println("2. " + sejarah2.getJudul());
                    System.out.println("3. " + sejarah3.getJudul());
                    System.out.println("4. " + sejarah4.getJudul());
                    System.out.println("5. " + sejarah5.getJudul());
                    System.out.print("select the book you want to display (1-5): ");
                    String pilihanSejarah = input.nextLine();
                    System.out.println(" ");
                    if (pilihanSejarah.equals("1")) {
                        System.out.println(sejarah1);
                    } else if (pilihanSejarah.equals("2")) {
                        System.out.println(sejarah2);
                    } else if (pilihanSejarah.equals("3")) {
                        System.out.println(sejarah3);
                    } else if (pilihanSejarah.equals("4")) {
                        System.out.println(sejarah4);
                    } else if (pilihanSejarah.equals("5")) {
                        System.out.println(sejarah5);
                    } else {
                        System.out.println("invalid option please try again.");
                    }
                    break;
                    case "4":
                    System.out.println("===== Religious Category Book =====");
                    System.out.println("1. " + agama1.getJudul());
                    System.out.println("2. " + agama2.getJudul());
                    System.out.println("3. " + agama3.getJudul());
                    System.out.println("4. " + agama4.getJudul());
                    System.out.println("5. " + agama5.getJudul());
                    System.out.print("select the book you want to display (1-5): ");
                    String pilihanAgama = input.nextLine();
                    System.out.println(" ");
                    if (pilihanAgama.equals("1")) {
                        System.out.println(agama1);
                    } else if (pilihanAgama.equals("2")) {
                        System.out.println(agama2);
                    } else if (pilihanAgama.equals("3")) {
                        System.out.println(agama3);
                    } else if (pilihanAgama.equals("4")) {
                        System.out.println(agama4);
                    } else if (pilihanAgama.equals("5")) {
                        System.out.println(agama5);
                    } else {
                        System.out.println("invalid option please try again.");
                    }
                    break;
                    case "5":
                    System.out.println("===== Psychology Category Book =====");
                    System.out.println("1. " + psikologi1.getJudul());
                    System.out.println("2. " + psikologi2.getJudul());
                    System.out.println("3. " + psikologi3.getJudul());
                    System.out.println("4. " + psikologi4.getJudul());
                    System.out.println("5. " + psikologi5.getJudul());
                    System.out.print("select the book you want to display (1-5): ");
                    String pilihanPsikologi = input.nextLine();
                    System.out.println(" ");
                    if (pilihanPsikologi.equals("1")) {
                        System.out.println(psikologi1);
                    } else if (pilihanPsikologi.equals("2")) {
                        System.out.println(psikologi2);
                    } else if (pilihanPsikologi.equals("3")) {
                        System.out.println(psikologi3);
                    } else if (pilihanPsikologi.equals("4")) {
                        System.out.println(psikologi4);
                    } else if (pilihanPsikologi.equals("5")) {
                        System.out.println(psikologi5);
                    } else {
                        System.out.println("invalid option please try again.");
                    }
                    break;
                    case "6":
                    System.out.println("===== Politic Category Book =====");
                    System.out.println("1. " + politik1.getJudul());
                    System.out.println("2. " + politik2.getJudul());
                    System.out.println("3. " + politik3.getJudul());
                    System.out.println("4. " + politik4.getJudul());
                    System.out.println("5. " + politik5.getJudul());
                    System.out.print("select the book you want to display (1-5): ");
                    String pilihanPolitik = input.nextLine();
                    System.out.println(" ");
                    if (pilihanPolitik.equals("1")) {
                        System.out.println(politik1);
                    } else if (pilihanPolitik.equals("2")) {
                        System.out.println(politik2);
                    } else if (pilihanPolitik.equals("3")) {
                        System.out.println(politik3);
                    } else if (pilihanPolitik.equals("4")) {
                        System.out.println(politik4);
                    } else if (pilihanPolitik.equals("5")) {
                        System.out.println(politik5);
                    } else {
                        System.out.println("invalid option please try again.");
                    }
                    break;
                    case "7":
                    System.out.println("===== Fiction Category Book =====");
                    System.out.println("1. " + fiksi1.getJudul());
                    System.out.println("2. " + fiksi2.getJudul());
                    System.out.println("3. " + fiksi3.getJudul());
                    System.out.println("4. " + fiksi4.getJudul());
                    System.out.println("5. " + fiksi5.getJudul());
                    System.out.print("select the book you want to display (1-5): ");
                    String pilihanFiksi = input.nextLine();
                    System.out.println(" ");
                    if (pilihanFiksi.equals("1")) {
                        System.out.println(fiksi1);
                    } else if (pilihanFiksi.equals("2")) {
                        System.out.println(fiksi2);
                    } else if (pilihanFiksi.equals("3")) {
                        System.out.println(fiksi3);
                    } else if (pilihanFiksi.equals("4")) {
                        System.out.println(fiksi4);
                    } else if (pilihanFiksi.equals("5")) {
                        System.out.println(fiksi5);
                    } else {
                        System.out.println("invalid option please try again.");
                    }
                    break;
                case "8":
                    System.out.println("Thank you for using this program.");
                    break;
                default:
                    System.out.println("invalid option please try again.");
            }

            System.out.println();

        } while (!pilihan.equals("8"));
        input.close();
    }
}
