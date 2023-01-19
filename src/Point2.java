

import java.util.Scanner;
import java.io.*;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
//
// -- guangkai

/**
 * This is Point2 class.
 * 
 * @author guangkai guangkai@vt.edu
 * @version 1 9/13/2022 3:07 pm
 */
public class Point2 {

    /**
     * This is the main() method to run the
     * whole program.
     * 
     * @param args
     *            as the lines in file.
     * @throws FileNotFoundException
     *             if no file read
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) throws FileNotFoundException {
//        if (args.length != 1) {
//            System.out.println("Usage: java Point2 <command-file>");
//            return;
//        }
        
        File f = new File(args[0]);
        String filename = args[0].trim();

        
        if (!f.exists()) {
            
            System.out.println("File does not exist: " + filename);
            return;
        }
        
        // Read strings or number in line
        @SuppressWarnings("resource")
        Scanner read = new Scanner(f);
        String line;
        
        SkipList<String, Point> list = new SkipList<>();
        QuadTree<Point> tree = new QuadTree<Point>();
        while (read.hasNextLine()) {
            
            line = read.nextLine();

            if (line.isBlank()) {
                
                continue;
            }

            String[] splited = line.trim().split(" +\t*");
            String command = splited[0];
            // insert
            if (command.equals("insert")) {
                
                String name = splited[1];
                int x = Integer.parseInt(splited[2]);
                int y = Integer.parseInt(splited[3]);

                Point a = new Point(x, y, name);

                if (x < 0 ||
                    y < 0 ||
                    x > 1023 ||
                    y > 1023) {
                    
                    System.out.println("Point rejected: (" + a
                        .toString() + ")");
                }
                else {
                    
                    list.insert(name, a);
                    tree.insert(a);
                    System.out.println("Point inserted: (" + a
                        .toString() + ")");
                }
            }
            if (command.equals("remove")) {
                
                // remove in SkipList
                if (splited.length == 2) {
                    String name = splited[1];
                    KVPair<String, Point> thing = list.removeByName(name);
                    Point tar;
                    if (thing != null) {
                        tar = thing.value();
                        tree.removeCalled(tar.getX(), tar.getY(), thing.key());
                        System.out.println("Point removed: (" + thing
                            .toString() + ")");
                    }
                    else {
                        System.out.println("Point not removed: "
                            + name);
                    }
                }
                // remove in Quadtree
                else if (splited.length == 3) {
                    int x = Integer.parseInt(splited[1]);
                    int y = Integer.parseInt(splited[2]);
                    
                    if (x < 0 ||
                        y < 0 ||
                        x > 1023 ||
                        y > 1023) {
                        
                        System.out.println("Point rejected: (" + x
                            + ", " + y + ")");
                    }
                    else {
                        tree.remove(x, y, "", list);
                    }
                }
            }
            // dump
            if (command.equals("dump")) {
                
                System.out.println("SkipList dump:");
                int out = list.dump();
                System.out.println("SkipList size is: " + out);
                System.out.println("QuadTree dump:");
                int numberOfNode = tree.dump(0, 0, 1024, 0, 0);
                System.out.println(numberOfNode + " quadtree nodes printed");
            }
            // duplicates
            if (command.equals("duplicates")) {
                
                System.out.println("Duplicate points:");
                tree.duplicates();
            }
            // search
            if (command.equals("search")) {
                String name = splited[1];
                list.search(name);
            }
            
            // regionSearch
            if (command.equals("regionsearch")) {
                
                int x = Integer.parseInt(splited[1]);
                int y = Integer.parseInt(splited[2]);
                int w = Integer.parseInt(splited[3]);
                int h = Integer.parseInt(splited[4]);
                
                
                if (w > 0 && h > 0) {
                    System.out.println("Points intersecting region (" 
                        + x + ", " + y + ", " + w + ", " + h + ")");
                    int numberOfNode = 0;
                    numberOfNode = tree.regionSearch(x, y, w, h, numberOfNode);
                    System.out.println(numberOfNode 
                        + " quadtree nodes visited");
                }
                else {
                    
                    System.out.println("Rectangle rejected: (" 
                        + x + ", " + y + ", " + w + ", " + h + ")");
                }
            }
        }
    }
}