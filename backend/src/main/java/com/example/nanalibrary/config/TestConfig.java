package com.example.nanalibrary.config;

import com.example.nanalibrary.entities.Book;
import com.example.nanalibrary.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    BookServiceImpl repository;

    @Override
    public void run(String... args) throws Exception {

        Book b1 = new Book("Biography", "Becoming", Arrays.asList("Michelle Obama"), "Random House Uk", "becoming.jpg",
                "\n" +
                        "\n" +
                        "An intimate, powerful, and inspiring memoir; 17 million copies sold worldwide\n" +
                        "\n" +
                        "THE NO. 1 BESTSELLER\n" +
                        "\n" +
                        "Now in paperback featuring a new introduction by Michelle Obama, a letter from the author to her younger self, and a book club guide with 20 discussion questions and a 5-question Q&A, the intimate, powerful, and inspiring memoir by the former First Lady of the United States\n" +
                        "\n" +
                        "In her memoir, a work of deep reflection and mesmerizing storytelling, Michelle Obama invites readers into her world, chronicling the experiences that have shaped her -- from her childhood on the South Side of Chicago to her years as an executive balancing the demands of motherhood and work, to her time spent at the world's most famous address. With unerring honesty and lively wit, she describes her triumphs and her disappointments, both public and private, telling her full story as she has lived it -- in her own words and on her own terms.\n" +
                        "\n" +
                        "Warm, wise, and revelatory, Becoming is the deeply personal reckoning of a woman of soul and substance who has steadily defied expectations -- and whose story inspires us to do the same.\n" +
                        "\n" +
                        "THE LIGHT WE CARRY IS AVAILABLE NOW\n" +
                        "\n" +
                        "Sunday Times bestseller, November 2018\n",
                        "https://tinyurl.com/5be5uaam");
        Book b2 = new Book("Biography", "Finding me", Arrays.asList("Viola Davis"), "Harper Collins", "finding_me.jpg",
                "\n" +
                        "\n" +
                        "THE INSTANT SUNDAY TIMES BESTSELLER\n" +
                        "\n" +
                        "'A mind-blowing and emotionally honest tale of survival against all odds.' BERNARDINE EVARISTO\n" +
                        "\n" +
                        "'A breathtaking memoir...I was so moved by this book.' Oprah\n" +
                        "\n" +
                        "'It is startlingly honest and, at times, a jaw-dropping read, charting her rise from poverty and abuse to becoming the first African-American to win the triple crown of an Oscar, Emmy and Tony for acting.' BBC News\n" +
                        "\n" +
                        "THE DEEPLY PERSONAL, BRUTALLY HONEST ACCOUNT OF VIOLA'S INSPIRING LIFE\n" +
                        "\n" +
                        "In my book, you will meet a little girl named Viola who ran from her past until she made a life changing decision to stop running forever.\n" +
                        "This is my story, from a crumbling apartment in Central Falls, Rhode Island, to the stage in New York City, and beyond. This is the path I took to finding my purpose and my strength, but also to finding my voice in a world that didn't always see me.\n" +
                        "As I wrote Finding Me, my eyes were open to the truth of how our stories are often not given close examination. They are bogarted, reinvented to fit into a crazy, competitive, judgmental world. So I wrote this for anyone who is searching for a way to understand and overcome a complicated past, let go of shame, and find acceptance. For anyone who needs reminding that a life worth living can only be born from radical honesty and the courage to shed facades and be...you.\n" +
                        "Finding Me is a deep reflection on my past and a promise for my future. My hope is that my story will inspire you to light up your own life with creative expression and rediscover who you were before the world put a label on you.\n",
                        "https://tinyurl.com/ys6wkv28");

        Book b3 = new Book("Parenting & Relationships", "The Whole-Brain Child", Arrays.asList("Daniel J. Siegel", "Tina Payne Bryson"), "Random House Publishing Group", "whole_brain_child.jpg", "\n" +
                "\n" +
                "NEW YORK TIMES BESTSELLER • More than 1 million copies in print! • The authors of No-Drama Discipline and The Yes Brain explain the new science of how a child’s brain is wired and how it matures in this pioneering, practical book.\n" +
                " \n" +
                "“Simple, smart, and effective solutions to your child’s struggles.”—Harvey Karp, M.D.\n" +
                " \n" +
                "In this pioneering, practical book, Daniel J. Siegel, neuropsychiatrist and author of the bestselling Mindsight, and parenting expert Tina Payne Bryson offer a revolutionary approach to child rearing with twelve key strategies that foster healthy brain development, leading to calmer, happier children. The authors explain—and make accessible—the new science of how a child’s brain is wired and how it matures. The “upstairs brain,” which makes decisions and balances emotions, is under construction until the mid-twenties. And especially in young children, the right brain and its emotions tend to rule over the logic of the left brain. No wonder kids throw tantrums, fight, or sulk in silence. By applying these discoveries to everyday parenting, you can turn any outburst, argument, or fear into a chance to integrate your child’s brain and foster vital growth.            \n" +
                " \n" +
                "Complete with age-appropriate strategies for dealing with day-to-day struggles and illustrations that will help you explain these concepts to your child, The Whole-Brain Child shows you how to cultivate healthy emotional and intellectual development so that your children can lead balanced, meaningful, and connected lives.\n" +
                "\n" +
                "“[A] useful child-rearing resource for the entire family . . . The authors include a fair amount of brain science, but they present it for both adult and child audiences.”—Kirkus Reviews\n" +
                "\n" +
                "“Strategies for getting a youngster to chill out [with] compassion.”—The Washington Post\n" +
                "\n" +
                "“This erudite, tender, and funny book is filled with fresh ideas based on the latest neuroscience research. I urge all parents who want kind, happy, and emotionally healthy kids to read The Whole-Brain Child. This is my new baby gift.”—Mary Pipher, Ph.D., author of Reviving Ophelia and The Shelter of Each Other\n" +
                "\n" +
                "“Gives parents and teachers ideas to get all parts of a healthy child’s brain working together.”—Parent to Parent\n",
                "https://tinyurl.com/6m78y7eb");

        Book b4 = new Book("Romance", "The Notebook", Arrays.asList("Nicholas Sparks"), "Sphere", "the_notebook.jpg", "\n" +
                "\n" +
                "Celebrating 25 years of The Notebook - the classic novel which became the heart-wrenching film.\n" +
                "\n" +
                "*\n" +
                "\n" +
                "Once again, just as I do every day, I begin to read the notebook aloud...\n" +
                "\n" +
                "Noah Calhoun has returned from war and, in an attempt to escape the ghosts of battle, he sets his mind and his body to restoring an old plantation home to its former beauty.\n" +
                "\n" +
                "But he is haunted by memories of the beautiful girl he met there years before. A girl who stole his heart at the funfair, whose parents didn't approve, a girl he wrote to every day for a year.\n" +
                "\n" +
                "When Allie Hamilton shows up on his doorstep, exactly as he has held her in his memory for all these years, Noah has one last chance to win her back. Only this time, it's not just her parents in the way - Allie is engaged and she's not a woman to go back on her promises.\n" +
                "\n" +
                "The Notebook is the love story to end all love stories - it will break your heart, heal it back up and break it all over again.\n" +
                "\n" +
                "Praise for Nicholas Sparks:\n" +
                "\n" +
                "'A fiercely romantic and touching tale' Heat\n" +
                "\n" +
                "'An A-grade romantic read' OK!\n" +
                "\n" +
                "'Pulls at the heartstrings' Sunday Times\n" +
                "\n" +
                "'An absorbing page-turner' Daily Mail\n" +
                "\n" +
                "'This one won't leave a dry eye' Daily Mirror\n",
                "https://tinyurl.com/537jw4n5");
        Book b5 = new Book("Technical", "Clean code", Arrays.asList("Robert C. Martin"), "Pearson", "clean_code.jpg", "Even bad code can function. But if code isn’t clean, it can bring a development organization to its knees. Every year, countless hours and significant resources are lost because of poorly written code. But it doesn’t have to be that way.\n" +
                "\n" +
                "Noted software expert Robert C. Martin presents a revolutionary paradigm with Clean Code: A Handbook of Agile Software Craftsmanship. Martin has teamed up with his colleagues from Object Mentor to distill their best agile practice of cleaning code “on the fly” into a book that will instill within you the values of a software craftsman and make you a better programmer―but only if you work at it.\n" +
                "\n" +
                "What kind of work will you be doing? You’ll be reading code―lots of code. And you will be challenged to think about what’s right about that code, and what’s wrong with it. More importantly, you will be challenged to reassess your professional values and your commitment to your craft.\n" +
                "\n" +
                "Clean Code is divided into three parts. The first describes the principles, patterns, and practices of writing clean code. The second part consists of several case studies of increasing complexity. Each case study is an exercise in cleaning up code―of transforming a code base that has some problems into one that is sound and efficient. The third part is the payoff: a single chapter containing a list of heuristics and “smells” gathered while creating the case studies. The result is a knowledge base that describes the way we think when we write, read, and clean code.\n" +
                "\n" +
                "Readers will come away from this book understanding\n" +
                "\n" +
                "    How to tell the difference between good and bad code\n" +
                "    How to write good code and how to transform bad code into good code\n" +
                "    How to create good names, good functions, good objects, and good classes\n" +
                "    How to format code for maximum readability\n" +
                "    How to implement complete error handling without obscuring code logic\n" +
                "    How to unit test and practice test-driven development\n" +
                "\n" +
                "This book is a must for any developer, software engineer, project manager, team lead, or systems analyst with an interest in producing better code. ",
                "https://tinyurl.com/5886b2py");

        Book b6 = new Book("Children", "The Little Prince", Arrays.asList("Antoine de Saint-Exupéry"), "BN Publishing", "little_prince.jpg", "The Little Prince describes his journey from planet to planet, each tiny world populated by a single adult. It's a wonderfully inventive sequence, which evokes not only the great fairy tales but also such monuments of postmodern whimsy. The author pokes similar fun at a businessman, a geographer, and a lamplighter, all of whom signify some futile aspect of adult existence.",
                "https://tinyurl.com/3ajzyvzp");

        Book b7 = new Book("Science Fiction", "Angels & Demons", Arrays.asList("Dan Brown"), "Corgi Books", "angels_demons.jpg", "CERN Institute, Switzerland: um cientista mundialmente renowned é fundamentado com um símbolo misterioso que seared onto your chest.\n" +
                "\n" +
                "The Vatican, Rome: os conjuntos College of Cardinals para elect uma nova pope. Somewhere beneath them, uma bomba sem stoppable de terrifying power relentlessly conts down to oblivion.\n" +
                "\n" +
                "In a breathtaking race against time, Harvard professor Robert Langdon deve decipher a labyrinthine trail of ancient symbols if he is to defeat those responsible - the Illuminati, a secret brotherhood presumed extinct for nearly five hundred years, reborn to continuue their deadly vendetta contra o seu enema mais cheio, a Igreja Católica. ",
                "https://tinyurl.com/kftdbydk");

        Book b8 = new Book("Mystery", "Harry Potter And The Chamber Of Secrets", Arrays.asList("J.K. Rowling"), "Bloomsbury", "harry_potter.jpg", "\n" +
                "\n" +
                "Harry Potter's summer has included the worst birthday ever, doomy warnings from a house-elf called Dobby, and rescue from the Dursleys by his friend Ron Weasley in a magical flying car! Back at Hogwarts School of Witchcraft and Wizardry for his second year, Harry hears strange whispers echo through empty corridors - and then the attacks start. Students are found as though turned to stone . Dobby's sinister predictions seem to be coming true.\n" +
                "\n" +
                "These new editions of the classic and internationally bestselling, multi-award-winning series feature instantly pick-up-able new jackets by Jonny Duddle, with huge child appeal, to bring Harry Potter to the next generation of readers. It's time to PASS THE MAGIC ON .\n",
                "https://tinyurl.com/nhdkkanc");

        Book b9 = new Book("Science Fiction", "The Da Vinci Code", Arrays.asList("Dan Brown"), "Anchor", "da_vinci_code.jpg", " #1 WORLDWIDE BESTSELLER • While in Paris, Harvard symbologist Robert Langdon is awakened by a phone call in the dead of the night. The elderly curator of the Louvre has been murdered inside the museum, his body covered in baffling symbols. \n" +
                "\n" +
                "“Blockbuster perfection.... A gleefully erudite suspense novel.” —The New York Times\n" +
                "\n" +
                "“A pulse-quickening, brain-teasing adventure.” —People\n" +
                "\n" +
                "As Langdon and gifted French cryptologist Sophie Neveu sort through the bizarre riddles, they are stunned to discover a trail of clues hidden in the works of Leonardo da Vinci—clues visible for all to see and yet ingeniously disguised by the painter.\n" +
                "\n" +
                "Even more startling, the late curator was involved in the Priory of Sion—a secret society whose members included Sir Isaac Newton, Victor Hugo, and Da Vinci—and he guarded a breathtaking historical secret. Unless Langdon and Neveu can decipher the labyrinthine puzzle—while avoiding the faceless adversary who shadows their every move—the explosive, ancient truth will be lost forever. ",
                "https://tinyurl.com/579bx83v");
        Book b10 = new Book("Parenting & Relationships", "Far From The Tree: Parents, Children and the Search for Identity", Arrays.asList("Andrew Solomon"), "Scribner", "far_from_the_tree.jpg", " * Selected as One of the Best Books of the 21st Century by The New York Times *\n" +
                "\n" +
                "* WINNER of the National Book Critics Circle Award * Books for a Better Life Award * The New York Times Book Review’s 10 Best Books of the Year *\n" +
                "\n" +
                "This masterpiece by the National Book Award–winning author of The Noonday Demon features stories of parents who not only learn to deal with their exceptional children, but also find profound meaning in doing so—“a brave, beautiful book that will expand your humanity” (People).\n" +
                "\n" +
                "Solomon’s startling proposition in Far from the Tree is that being exceptional is at the core of the human condition—that difference is what unites us. He writes about families coping with deafness, dwarfism, Down syndrome, autism, schizophrenia, or multiple severe disabilities; with children who are prodigies, who are conceived in rape, who become criminals, who are transgender. While each of these characteristics is potentially isolating, the experience of difference within families is universal, and Solomon documents triumphs of love over prejudice in every chapter.\n" +
                "\n" +
                "All parenting turns on a crucial question: to what extent should parents accept their children for who they are, and to what extent they should help them become their best selves. Drawing on ten years of research and interviews with more than three hundred families, Solomon mines the eloquence of ordinary people facing extreme challenges.\n" +
                "\n" +
                "Elegantly reported by a spectacularly original and compassionate thinker, Far from the Tree explores how people who love each other must struggle to accept each other—a theme in every family’s life. ",
                "https://tinyurl.com/49a95muc");

        repository.saveBook(b1);
        repository.saveAllBooks(Arrays.asList(b2, b3, b4, b5, b6, b7, b8, b9, b10));

    }
}
