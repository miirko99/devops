void func(String input){
    switch(input) {
        case ~/^[^ ]*@[a-zA-Z]+\.com$/:
            println("input je neki mail")
        break
        case ~/^\+381\d{6,9}$/:
            println("input je srpski broj telefona bez crtica (-)")
        break
        case ~/([A-Z][a-z]+ ){1,3}(bb|\d+)/:
            println("input je neka adresa")
        break

    }
}
func("mrko@gma.com")
func("+381640454037")
func("Neka Ulica 33")
func("Neka Ulica bb")
func("Ulic 33")


