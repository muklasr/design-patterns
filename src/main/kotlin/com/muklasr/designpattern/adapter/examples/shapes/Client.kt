package com.muklasr.designpattern.adapter.examples.shapes

fun main(){

    val roundHole = RoundHole(5.0)
    val roundPeg = RoundPeg(5.0)

    if(roundHole.fits(roundPeg)){
        println("Round peg r5 fits round hole r5.")
    }

    val smallSqPeg = SquarePeg(2.0)
    val largeSqPeg = SquarePeg(20.0)
//    roundHole.fits(smallSqPeg)

    val smallSqPegAdapter = SquarePegAdapter(smallSqPeg)
    val largeSqPegAdapter = SquarePegAdapter(largeSqPeg)
    if(roundHole.fits(smallSqPegAdapter)){
        println("Square peg w2 fits round hole r5.")
    }
    if(!roundHole.fits(largeSqPegAdapter)){
        println("Square peg w20 does not fit into round hole r5.")
    }

}