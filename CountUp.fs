open System

let rec countUp n acc =
    if n > acc then
        countUp n (acc + 1L)
    else
        acc
