package kongfu.chapter08

/**
 * application expects the line width as the first command-line argument, 
 * and interprets subsequent arguments as file names
 */
object Runner extends App {

  val files = new java.io.File("src/kongfu/chapter08").listFiles
  val paths = for(file <- files) yield file.getPath
  for (path <- paths)
    LongLines.processFileFunctional(10, path)

//  val width = args(0)
//  for(arg <- args.drop(1))
//	  LongLines.processFileFunctional(width.toInt, arg)
}