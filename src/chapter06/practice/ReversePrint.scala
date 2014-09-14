package chapter06.practice

object ReversePrint extends App {

  for(str <- args.reverse) {
    print(str + " ")
  }
  
}