trait Expression() -> string {
	fn print(&self);
}

struct Literal {
	s: string;
}

impl Expression for Literal{
	fn print(&self){
		println!(value.to_string());
	}
}

fn main(){
	let a = Literal("asas");
	a.print();
}	