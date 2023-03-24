import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan;

        // OBJEK TEKNOLOGI
        Book teknologi1 = new Book("The Art of Doing Science and Engineering: Learning to Learn", "Richard W. Hamming","Technology", "26 May 2020", "Stripe Press", "978-1732265172", "432", "2.1", "9.25", "6.25","The Art of Doing Science and Engineering is a reminder that a capacity for learning and creativity are accessible  to everyone. Hamming was as much a teacher as a scientist, and having spent a lifetime forming and confirming a theory of great people and great ideas, he prepares the next generation for even greater distinction.");
        Book teknologicopy1 = teknologi1.copy();
        Book teknologi2 = new Book("An Elegant Puzzle: Systems of Engineering Management", "Will Larson", "Technology","20 May 2019", "Stripe Press", "978-1732265189", "288", "1.59", "6", "9","There’s a saying that people don’t leave companies, they leave managers. Management is a key part of any organization, yet the discipline is often self-taught and unstructured. Getting to the good solutions for complex management challenges can make the difference between fulfillment and frustration for teams—and, ultimately, between the success and failure of companies.");
        Book teknologicopy2 = teknologi2.copy();
        Book teknologi3 = new Book("Professional Issues in Information Technology", "Frank Bott", "Technology","27 January 2014", "BCS, The Chartered Institute for IT", "978-1780171807", "209", "0.75", "6.69","9.61","Relevant to all sizes of organisations, this book addresses the social, legal, financial, organisational and ethical issues faced by IT professionals. It is designed to accompany the BCS HEQ ‘Diploma in IT’ core module: Professional Issues in Information Systems Practice. This new edition takes into account the social and legal implications of the substantial changes to legislation and technology over recent years, for example cloud computing, the Digital Economy Act and the Equality Act.");
        Book teknologicopy3 = teknologi3.copy();
        Book teknologi4 = new Book("Computing and Technology Ethics: Engaging through Science Fiction","Emanuelle Burton", "Technology", "14 February 2023", "The MIT Press", "978-0262048064", "504", "2.15","8.2", "9.3","Computing and Technology Ethics: Engaging through Science Fiction first introduces the major ethical frameworks: deontology, utilitarianism, virtue ethics, communitarianism, and the modern responses of responsibility ethics, feminist ethics, and capability ethics");
        Book teknologicopy4 = teknologi4.copy();
        Book teknologi5 = new Book("The Story of NFTs: Artists, Technology, and Democracy", "Amy Whitaker","Technology", "7 March 2023", "Rizzoli Electa", "978-0847899364", "144", "1.2", "7.15", "11.24","Since the NFT phenomenon took over the art world, useful information that isn’t too reductive is in short supply. Artists, collectors, arts professionals, art lovers, and museumgoers are still trying to understand what NFTs are, how to benefit from or engage with them, and what they mean for the art world in the future. This book is precisely for this audience.");
        Book teknologicopy5 = teknologi5.copy();
        
        // OBJEK FILSAFAT
        Book filsafat1 = new Book("The Cambridge History of Moral Philosophy", "Sacha Golob", "Philosophy", "16 February 2023", "Cambridge University Press", "978-1009364034", "764", "2.39", "6", "9"," Topics including Epicureanism, humanism, Jewish and Arabic thought, perfectionism, pragmatism, idealism and intuitionism are all explored, as are figures including Aristotle, Boethius, Spinoza, Hobbes, Hume, Kant, Hegel, Mill, Nietzsche, Heidegger, Sartre and Rawls, as well as numerous key ideas and schools of thought.");
        Book filsafat2 = new Book("Natural Philosophy: On Retrieving a Lost Disciplinary Imaginary", "Alister McGrath", "Philosophy", "10 February 2023", "Oxford University Press", "978-0192865731", "256", "1.2", "9.48", "6.41","This book argues for the retrieval of 'natural philosophy', a concept that faded into comparative obscurity as individual scientific disciplines became established and institutionalized.");
        Book filsafat3 = new Book("The Socratic Method: A Practitioner’s Handbook", "Ward Farnsworth", "Philosophy", "5 October 2021", "David R. Godine", "978-1567926859", "264", "1.2", "6.25", "9.25","As Farnsworth achieved with The Practicing Stoic and the Farnsworth’s Classical English series, ideas of old are made new and vital again. This book is for those coming to philosophy the way Socrates did―as the everyday activity of making sense out of life and how to live it―and for anyone who wants to know what he said about doing that better.");
        Book filsafat4 = new Book("The Practicing Stoic: A Philosophical User's Manual", "Ward Farnsworth", "Philosophy", "1 April 2018", "David R. Godine", "978-1567926118", "256", "1.2", "6.2", "9.1","A foundational idea to Stoicism is that we appear to go through life reacting directly to events. That appearance is an illusion. We react to our judgments and opinions―to our thoughts about things, not to things themselves. Stoics seek to become conscious of those judgments, to find the irrationality in them, and to choose them more carefully.");
        Book filsafat5 = new Book("Beyond Good and Evil", "Friedrich Nietzsche", "Philosophy", "6 November 2018", "CreateSpace Independent Publishing Platform", "978-1503250888", "116", "1.2", "6", "9","Beyond Good and Evil: Prelude to a Philosophy of the Future is a book by philosopher Friedrich Nietzsche, first published in 1886. It draws on and expands the ideas of his previous work, Thus Spoke Zarathustra, but with a more critical and polemical approach.");

        // OBJEK SEJARAH
        Book sejarah1 = new Book("Philosophy of Democratic Government (Charles R. Walgreen Foundation Lectures)", "Yves R. Simon", "History", "30 January 1993", "University of Notre Dame Press", "978-0268038038", "344", "0.9", "8.55", "5.56","This complete treatise of political philosophy demonstrates Yves R. Simon's belief that, even in the best conceivable circumstances, government is needed to determine direction toward the common good and to provide the means for united action.");
        Book sejarah2 = new Book("History of the World Map by Map", "Smithsonian Institution", "History", "23 October 2018", "DK", "978-1465475855", "440", "5.6", "10.31", "12.25","Maps don't just show us where to go, but also where we've been. If you're interested in finding out more about the biggest events in world history, then this book all about history of the world is perfect for you!");
        Book sejarah3 = new Book("History: From the Dawn of Civilization to the Present Day", "Smithsonian Institution", "History", "1 September 2015", "DK", "978-1465437976", "620", "6.9", "10.37", "12.25","Human endeavor and achievement are charted and celebrated from every angle, alongside key events, groundbreaking ideas, political forces, and technological advances that have shaped our planet’s progress");
        Book sejarah4 = new Book("On This Day in History Sh!t Went Down", "James Fell", "History", "17 April 2021", "BFW Publishing", "978-1777574208", "393", "1.16", "6", "9"," Mae West was sent to jail for “corrupting the morals of youth” with her first Broadway play. When participation in the Hitler Youth became mandatory in Germany, groups of teen “pirates” rebelled. ");
        Book sejarah5 = new Book("Why Are They So Poor? Capitalism: A People's History", "David N.Singerman ", "History", "22 September 2021", "Amazon Pro Hub", "978-1503250888", "255", "0.8", "5.5", "8.5","David Singerman travels to the far reaches and recesses of the southern continents of Asia, Africa, and Latin America, the so-called Third World, in order to understand why they are so poor.");
        
        // OBJEK AGAMA
        Book agama1 = new Book("God Is Not One: The Eight Rival Religions That Run the World", "Stephen Prothero", "Religious", "3 May 2011", "HarperOne", "978-0061571282", "400", "0.8", "5.31", "8","The Eight Rival Religions That Run the World, New York Times bestselling author of Religious Literacy and religion scholar Stephen Prothero argues that persistent attempts to portray all religions as different paths to the same God overlook the distinct problem that each tradition seeks to solve.");
        Book agama2 = new Book("Introduction to World Religions: Third Edition", "Christopher Partridge", "Religious", "1 May 2018", "Fortress Pres", "978-1506445946", "603", "2.8", "7.5", "9.2","This leading textbook for world religion is designed to help students in their study and research of the world's religious traditions. Known and valued for its balanced approach and its respected board of consulting editors, this text addresses ways to study religion, provides broad coverage of diverse religions, and offers an arresting layout with rich illustrations.");
        Book agama3 = new Book("Religion Matters", "Stephen Prothero", "Religious", "1 July 2020", "W. W. Norton & Company", "978-0393422047", "640", "2.71", "8", "10","A religion is a system of stories, and there is no better way to engage with the world’s religions than through the stories that animate their beliefs and practices.");
        Book agama4 = new Book("The Psychedelic Origin of Religion", "Matthew Lawrence Weintrub", "Religious", "22 January 2023", "Independently published", "979-8373191289", "286", "0.8", "5.5", "8.5","Matthew Weintrub, a healer, psychedelic activist, scholar, and entrepreneur, presents The Psychedelic Origin of Religion, an exploration of the common heritage of psychedelics and shamanism in all world religions. ");
        Book agama5 = new Book("World Religions: The Great Faiths Explored and Explained", "John Bowker", "Religious", "12 October 2021", "DK", "978-0744034752", "352", "2.8", "7.81", "9.19","World Religions is a beautifully illustrated and annotated guide to world religions: from ancient religions such as Celtic and Norse beliefs to the main faiths of our modern world: Christianity, Islam, Judaism, Sikhism, Buddhism, Hinduism, and more. ");

        // OBJEK PSIKOLOGI
        Book psikologi1 = new Book("The Psychology Book: Big Ideas Simply Explained", "DK", "Psyhcology", "21 February 2017", "DK", "978-1465458568", "352", "2.1", "7.81", "9.19","Part of the fascinating Big Ideas series, this book tackles tricky topics and themes in a simple and easy to follow format. Learn about Psychology in this overview guide to the subject, great for beginners looking to learn and experts wishing to refresh their knowledge alike! The Psychology Book brings a fresh and vibrant take on the topic through eye-catching graphics and diagrams to immerse yourself in. ");
        Book psikologi2 = new Book("Psychology 2e Textbook (2nd Edition)", "Rose M. Spielman", "Psyhcology", "29 May 2022", "Independently published", "979-8832775142", "779", "3.73", "8", "10","This is the official print version of this OpenStax textbook. OpenStax makes full-color hardcover and B&W paperback print copies available for students who prefer a hardcopy textbook to go with the free digital version of this OpenStax title.");
        Book psikologi3 = new Book("Psychology: A Complete Introduction", "Sandi Mann", "Psyhcology", "8 November 2016", "Teach Yourself", "978-1473609303", "400", "0.8", "5", "7.75","Psychology: A Complete Introduction is designed to give you everything you need to succeed, all in one place.");
        Book psikologi4 = new Book("Mindset: The New Psychology of Success", "Carol S. Dweck", "Psyhcology", "26 December 2007", "Ballantine Books", "978-0345472328", "320", "0.8", "5.2", "7.9","Dweck offers new insights into her now famous and broadly embraced concept. She introduces a phenomenon she calls false growth mindset and guides people toward adopting a deeper, truer growth mindset.");
        Book psikologi5 = new Book("The Psychology of Totalitarianism", "Mattias Desmet ", "Psyhcology", "23 June 2022", "Chelsea Green Publishing", "978-1645021728", "240", "1.25", "6", "9","Totalitarianism is not a coincidence and does not form in a vacuum. It arises from a collective psychosis that has followed a predictable script throughout history, its formation gaining strength and speed with each generation―from the Jacobins to the Nazis and Stalinists―as technology advances.");

        // OBJEK POLITIK
        Book politik1 = new Book("I Swear: Politics Is Messier Than My Minivan", "Katie Porter  ", "Politic", "11 April 2023", "Crown", "978-0593443989", "304", "1.25", "5.8", "8.5","Katie reveals how her challenges as an Iowa farmgirl diverted her to the Ivy League and how she came to see herself as a Californian, teaching law and raising three kids in Orange County.");
        Book politik2 = new Book("The Politics Book: Big Ideas Simply Explained", "DK ", "Politic", "6 February 2018", "DK", "978-1465473905", "352", "2.7", "7.75", "9.25","The Politics Book is a captivating introduction to the world's greatest thinkers and their political big ideas that continue to shape our lives today, aimed at adults with an interest in the subject and students wanting to gain more of an overview.");
        Book politik3 = new Book("Aristotle's Politics: Second Edition", "Aristotle ", "Politic", "4 March 2013", "University of Chicago Press", "978-0226921846", "320", "1.06", "6", "9","One of the fundamental works of Western political thought, Aristotle’s masterwork is the first systematic treatise on the science of politics.");
        Book politik4 = new Book("New York Politics: A Tale of Two States", "Edward V. Schneier ", "Politic", "15 March 2023", "Cornell University Press", "978-1501767272", "372", "1", "6", "9","Most New Yorkers have very little knowledge of how influence is wielded in Albany. This acclaimed book offers a chance to look behind those closed doors.");
        Book politik5 = new Book("Respectable", "Grundy", "Politic", "16 August 2022", "University of California Press", "978-0520340398", "356", "1.1", "6", "9","Respectable gathers the experiences of former students and others connected to Morehouse to illustrate the narrow, conservative vision of masculinity molded at a competitive Black institution.");

        // OBJEK FIKSI
        Book fiksi1 = new Book("All the Light We Cannot See: A Novel", "Anthony Doerr", "Fiction", "4 April 2017", "Scribner", "978-1501173219", "560", "1", "5.25", "8","Marie-Laure lives in Paris near the Museum of Natural History, where her father works. When she is twelve, the Nazis occupy Paris and father and daughter flee to the walled citadel of Saint-Malo, where Marie-Laure’s reclusive great uncle lives in a tall house by the sea.");
        Book fiksi2 = new Book("The Dictionary of Lost Words: A Novel", "Pip Williams", "Fiction", "3 May 2022", "Random House Publishing Group", "978-1984820747", "416", "0.8", "5.16", "7.94","Motherless and irrepressibly curious, she spends her childhood in the Scriptorium, an Oxford garden shed in which her father and a team of dedicated lexicographers are collecting words for the very first Oxford English Dictionary.");
        Book fiksi3 = new Book("The Keeper of Happy Endings", "Barbara Davis", "Fiction", "1 October 2022", "Lake Union Publishing", "978-1542021470", "415", "1.1", "5.5", "8.25","Soline Roussel is well schooled in the business of happy endings. For generations her family has kept an exclusive bridal salon in Paris, where magic is worked with needle and thread.");
        Book fiksi4 = new Book("Home Front: A Novel", "Kristin Hannah", "Fiction", "8 November 2022", "St. Martin's Griffin", "978-1250858238", "432", "0.8", "5.35", "8.25","Michael and Jolene Zarkades have to face the pressures of everyday life---children, careers, bills, chores---even as their twelve-year marriage is falling apart.");
        Book fiksi5 = new Book("Homecoming: A Novel", "Kate Morton", "Fiction", "4 April 2023", "Mariner Books", "978-0063020894", "560", "1.55", "6.4", "9.1","Many years later and thousands of miles away, Jess is a journalist in search of a story. Having lived and worked in London for two decades, she now finds herself unemployed and struggling to make ends meet.");


        teknologicopy1.printDetail();

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
                        teknologi1.printDetail();
                    } else if (pilihanTeknologi.equals("2")) {
                        teknologi2.printDetail();;
                    } else if (pilihanTeknologi.equals("3")) {
                        teknologi3.printDetail();
                    } else if (pilihanTeknologi.equals("4")) {
                        teknologi4.printDetail();;
                    }  else if (pilihanTeknologi.equals("5")) {
                        teknologi5.printDetail();;
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
                        filsafat1.printDetail();
                    } else if (pilihanFilsafat.equals("2")) {
                        filsafat2.printDetail();;
                    } else if (pilihanFilsafat.equals("3")) {
                        filsafat3.printDetail();
                    } else if (pilihanFilsafat.equals("4")) {
                        filsafat4.printDetail();;
                    } else if (pilihanFilsafat.equals("5")) {
                        filsafat5.printDetail();;
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
                        sejarah1.printDetail();
                    } else if (pilihanSejarah.equals("2")) {
                        sejarah2.printDetail();
                    } else if (pilihanSejarah.equals("3")) {
                        sejarah3.printDetail();
                    } else if (pilihanSejarah.equals("4")) {
                        sejarah4.printDetail();
                    } else if (pilihanSejarah.equals("5")) {
                        sejarah5.printDetail();
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
                        agama1.printDetail();
                    } else if (pilihanAgama.equals("2")) {
                        agama2.printDetail();
                    } else if (pilihanAgama.equals("3")) {
                        agama3.printDetail();
                    } else if (pilihanAgama.equals("4")) {
                        agama4.printDetail();
                    } else if (pilihanAgama.equals("5")) {
                        agama5.printDetail();
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
                        psikologi1.printDetail();
                    } else if (pilihanPsikologi.equals("2")) {
                        psikologi2.printDetail();
                    } else if (pilihanPsikologi.equals("3")) {
                        psikologi3.printDetail();
                    } else if (pilihanPsikologi.equals("4")) {
                        psikologi4.printDetail();
                    } else if (pilihanPsikologi.equals("5")) {
                        psikologi5.printDetail();
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
                        politik1.printDetail();
                    } else if (pilihanPolitik.equals("2")) {
                        politik2.printDetail();
                    } else if (pilihanPolitik.equals("3")) {
                        politik3.printDetail();
                    } else if (pilihanPolitik.equals("4")) {
                        politik4.printDetail();
                    } else if (pilihanPolitik.equals("5")) {
                        politik5.printDetail();
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
                        fiksi1.printDetail();
                    } else if (pilihanFiksi.equals("2")) {
                        fiksi2.printDetail();
                    } else if (pilihanFiksi.equals("3")) {
                        fiksi3.printDetail();
                    } else if (pilihanFiksi.equals("4")) {
                        fiksi4.printDetail();
                    } else if (pilihanFiksi.equals("5")) {
                        fiksi5.printDetail();
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
