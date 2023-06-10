package SingletonAOP;

import com.mycompany.main.Singleton;

public aspect SingletonAspecto {
	
	  private Singleton single_instance;

	  pointcut singletonObjectCreation(): call(Singleton.new()) && !within(SingletonAspecto);

	    after() returning(Singleton singleton): singletonObjectCreation() {
	        if (single_instance == null) {
	            single_instance = singleton;
	        }
	    }

	    Object around(): call(* Singleton.*()) && !within(SingletonAspecto) {
	 
			if (single_instance != null) {
	            return single_instance;
	        }
	        return proceed();
	    }
    
}
