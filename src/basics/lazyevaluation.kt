package basics

import kotlin.system.measureTimeMillis

fun main() {
    val seq =  generateSequence(0) { it + 1 }

    var sum = 0L
    var takeBeforeSum  = 0L
    var takeAferSum = 0L

    val sumMs =  measureTimeMillis {
        sum = seq
            .filter { it in (50..1000000)  }
            .map { it * 2 }
            .take(1000)
            .sum()
            .toLong()
    }

    val takeBeforeMs =  measureTimeMillis {
        takeBeforeSum = seq
            .filter { it in (50..1000000)  }
            .take(1000)
            .map { it * 2 }
            .sum()
            .toLong()
    }

    println(" Take before,  ms : ${takeBeforeMs} ==> ${sum}")
    println(" Take after,  ms : ${sumMs} ==> ${takeBeforeSum}")


    val bigSeq = (1..1000000).toList()

    val nonsequenceMS =  measureTimeMillis {
        sum = bigSeq
            .filter { it > 50   }
            .take(1000)
            .map { it * 2 }
            .sum()
            .toLong()
    }

    val takeAfterMS =  measureTimeMillis {
         takeAferSum = bigSeq
             .filter { it > 50  }
             .map { it * 2 }
             .take(1000)
             .sum()
             .toLong()
    }

    val sequenceMs =  measureTimeMillis {
        takeBeforeSum = bigSeq.asSequence()
            .filter { it > 50  }
            .take(1000)
            .map { it * 2 }
            .sum()
            .toLong()
    }

    println(" Non Sequence, take before,  ms : ${nonsequenceMS} ==> ${sum}")
    println(" Non Sequence, take after,  ms : ${takeAfterMS} ==> ${takeAferSum}")
    println(" Sequence,  ms : ${sequenceMs} ==> ${takeBeforeSum}")


}