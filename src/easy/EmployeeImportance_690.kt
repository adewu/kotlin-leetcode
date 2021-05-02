package easy

class EmployeeImportance_690 {

	val map  = HashMap<Int,Employee>()
    fun getImportance(employees: List<Employee?>, id: Int): Int {
		for (e in employees){
			e?.id?.let { map.put(it,e) }
		}
		return dfs(id)
    }

	private fun dfs(id : Int): Int {
		val employee = map[id] ?: return 0
		var total = employee.importance
		val subordinates = employee.subordinates
		subordinates.forEach {
			total += dfs(it)
		}
		return total
	}

	fun exe(){
		//[[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
		val l = mutableListOf<Employee>()
		val e1 = Employee()
		e1.id = 1
		e1.importance = 5
		e1.subordinates = listOf(2,3)
		l.add(e1)

		val e2 = Employee()
		e2.id = 2
		e2.importance = 3
		e2.subordinates = listOf()

		val e3 = Employee()
		e3.id = 3
		e3.importance = 3
		e3.subordinates = listOf()

		l.add(e2)
		l.add(e3)

		print(getImportance(l,1))
	}

    class Employee {
        var id: Int = 0
        var importance: Int = 0
        var subordinates: List<Int> = listOf()
    }
}