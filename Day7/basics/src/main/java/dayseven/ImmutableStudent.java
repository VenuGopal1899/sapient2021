/**
 * 
 */
package dayseven;

/**
 * @author admi
 *
 */
public final class ImmutableStudent {
	
			private final int id;
			private final String name;
			private final Age age;
			/**
			 * @param id
			 * @param name
			 */
			public ImmutableStudent(int id, String name, Age age) {
				super();
				this.id = id;
				this.name = name;
				this.age = age;
			}
			/**
			 * @return the id
			 */
			public int getId() {
				return id;
			}
			/**
			 * @return the name
			 */
			public String getName() {
				return name;
			}
			/**
			 * @return the age
			 */
			public Age getAge() {
				return age;
			}
			
			
}
