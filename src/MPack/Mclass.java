 p a c k a g e   M P a c k ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . n e t . M a l f o r m e d U R L E x c e p t i o n ;  
 i m p o r t   j a v a . u t i l . c o n c u r r e n t . T i m e U n i t ;  
  
 i m p o r t   o r g . j u n i t . A f t e r ;  
 i m p o r t   o r g . j u n i t . B e f o r e ;  
 i m p o r t   o r g . j u n i t . T e s t ;  
 i m p o r t   o r g . o p e n q a . s e l e n i u m . B y ;  
 i m p o r t   o r g . o p e n q a . s e l e n i u m . W e b D r i v e r ;  
 i m p o r t   o r g . o p e n q a . s e l e n i u m . c h r o m e . C h r o m e D r i v e r ;  
 i m p o r t   o r g . o p e n q a . s e l e n i u m . s u p p o r t . u i . E x p e c t e d C o n d i t i o n s ;  
 i m p o r t   o r g . o p e n q a . s e l e n i u m . s u p p o r t . u i . W e b D r i v e r W a i t ;  
  
  
 p u b l i c   c l a s s   M c l a s s   {  
 	  
 	  
 	       S t r i n g   v a r 1 ;  
 	       W e b D r i v e r   d r i v e r ;  
 	       W e b D r i v e r W a i t   w a i t ;  
 	       S u p p o r t   s u p p o r t = n e w   S u p p o r t ( ) ;  
 	        
 	 	 @ B e f o r e  
 	 	 p u b l i c   v o i d   b e f o r M e t ( )   t h r o w s   I n t e r r u p t e d E x c e p t i o n ,   M a l f o r m e d U R L E x c e p t i o n  
 	 	 {  
 	 	 	 S y s t e m . s e t P r o p e r t y ( " w e b d r i v e r . c h r o m e . d r i v e r " ,   " C : \ \ U s e r s \ \ m o h i t k u m a r . s h a r m a \ \ D e s k t o p \ \ S e l e n i u m _ D a t a \ \ U s e d _ S o f t w a r e \ \ c h r o m e d r i v e r . e x e " ) ;  
 	 	 	   d r i v e r = n e w   C h r o m e D r i v e r ( ) ;  
 	 	 	      
 	 	 	   d r i v e r . m a n a g e ( ) . w i n d o w ( ) . m a x i m i z e ( ) ;  
 	 	 	    
 	 	 	   / * D e s i r e d C a p a b i l i t i e s   d c = D e s i r e d C a p a b i l i t i e s . f i r e f o x ( ) ;  
 	 	 	 	 d c . s e t C a p a b i l i t y ( " v e r s i o n " ,   " 4 7 . 0 " ) ;  
 	 	 	 	 d c . s e t C a p a b i l i t y ( " p l a t f o r m " ,   " W i n d o w s   7 " ) ;  
 	 	 	 	 d r i v e r = n e w   R e m o t e W e b D r i v e r ( n e w   U R L ( " h t t p : / / m o h i t k u m a r s h a r m a 1 : a 9 7 2 c c f 9 - 2 3 e 8 - 4 3 e 2 - 8 3 a 1 - 4 2 c 8 f 5 1 8 d c 9 2 @ o n d e m a n d . s a u c e l a b s . c o m : 8 0 / w d / h u b " ) ,   d c ) ;  
 	 	 	 	  
 	 	 	 	 d r i v e r = n e w   R e m o t e W e b D r i v e r ( n e w   U R L ( " h t t p : / / m o h i t k u m a r s h a r m a 1 : a 9 7 2 c c f 9 - 2 3 e 8 - 4 3 e 2 - 8 3 a 1 - 4 2 c 8 f 5 1 8 d c 9 2 @ o n d e m a n d . s a u c e l a b s . c o m : 8 0 / w d / h u b " ) ,   d c ) ;  
 	 	 	 	 * /  
 	 	 	    
 	 	 	 v a r 1 = " M o h i t F i l e R o o m 1 " + s u p p o r t . t i m e C a l c u l a t i o n ( ) ;  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " * * * * * * * * * * * C a l c u l a t e d   T i m e   i s :   " + s u p p o r t . t i m e C a l c u l a t i o n ( ) + " * * * * * * * * * * " ) ;  
 	 	 	 	  
 	 	 	 S y s t e m . o u t . p r i n t l n ( v a r 1 ) ;  
 	 	 	   S y s t e m . o u t . p r i n t l n ( " * * * * * * * * * * * * * * * * H i t t i n g   U R L   o n   B r o w s e r   f o r   " + v a r 1 + " * * * * * * * * * * * * * * * " ) ;  
 	 	 	   d r i v e r . g e t ( " h t t p s : / / s t a g e - w e b . c o r e . m e r r i l l c o r p . c o m " ) ;  
 	 	 	    
 	 	 	   / / T h r e a d . s l e e p ( 4 0 0 0 ) ; C : \ U s e r s \ m o h i t k u m a r . s h a r m a \ D e s k t o p \ U p l o a d F i l e s \ B M P 1 0 0  
 	 	 	    
 	 	 	    
 	 	 }  
 	 	  
 	 	  
 	 	 @ T e s t  
 	 	 p u b l i c   v o i d   a p p l i c a t i o n L o g i n ( )   t h r o w s   I n t e r r u p t e d E x c e p t i o n ,   I O E x c e p t i o n  
 	 	 {  
 	 	 	 w a i t = n e w   W e b D r i v e r W a i t ( d r i v e r ,   1 0 0 ) ;  
 	 	 	 w a i t . u n t i l ( E x p e c t e d C o n d i t i o n s . p r e s e n c e O f E l e m e n t L o c a t e d ( ( B y . i d ( " u s e r n a m e " ) ) ) ) ;  
 	 	 	  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " * * * * * * * * * * * * * * * * L o g i n   A p p l i c a t i o n   f o r   " + v a r 1 + " * * * * * * * * * * * * * * * " ) ;  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . i d ( " u s e r n a m e " ) ) . s e n d K e y s ( " s a n i t y 2 4 @ g m a i l . c o m " ) ;  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . i d ( " p a s s w o r d " ) ) . s e n d K e y s ( " t e s t @ 1 2 3 " ) ;  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ @ t y p e = ' s u b m i t ' ] " ) ) . c l i c k ( ) ;  
 	 	 	  
 	 	 	  
 	 	 	 / / W e b D r i v e r W a i t   w a i t = n e w   W e b D r i v e r W a i t ( d r i v e r ,   1 0 0 ) ;  
 	 	 	 w a i t . u n t i l ( E x p e c t e d C o n d i t i o n s . p r e s e n c e O f E l e m e n t L o c a t e d ( ( B y . x p a t h ( " . / / s p a n [ t e x t ( ) = ' D O C U M E N T S ' ] " ) ) ) ) ;  
 	 	 	  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " * * * * * * * * * * * * * * * * c l i c i n g   o n   d o u c m e n t   f o r   " + v a r 1 + " * * * * * * * * * * * * * * * " ) ;  
 	 	 	  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / s p a n [ t e x t ( ) = ' D O C U M E N T S ' ] " ) ) . c l i c k ( ) ;  
 	 	 	  
 	 	 	  
 	 	 	  
 	 	 	  
 	 	 	  
 	 	 	  
 	 	 	 w a i t . u n t i l ( E x p e c t e d C o n d i t i o n s . p r e s e n c e O f E l e m e n t L o c a t e d ( ( B y . x p a t h ( " . / / * [ @ c l a s s = ' t e x t - u p p e r c a s e   n g - b i n d i n g ' ] " ) ) ) ) ;  
 	 	 	 / / T h r e a d . s l e e p ( 3 0 0 0 ) ; C : \ U s e r s \ m o h i t k u m a r . s h a r m a \ D e s k t o p \ U p l o a d F i l e s \ B M P 1 0 0  
 	 	 	  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ @ c l a s s = ' t e x t - u p p e r c a s e   n g - b i n d i n g ' ] " ) ) . c l i c k ( ) ;  
 	 	 	  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " * * * * * * * * * * * * * * * * A d d i n g   F i l e r o o m   f o r   " + v a r 1 + " * * * * * * * * * * * * * * * " ) ;  
 	 	 	  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ @ n a m e = ' f i l e R o o m N a m e ' ] " ) ) . s e n d K e y s ( v a r 1 ) ;  
 	 	 	  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' A D D ' ] " ) ) . c l i c k ( ) ;  
 	 	 	  
 	 	 	 w a i t . u n t i l ( E x p e c t e d C o n d i t i o n s . p r e s e n c e O f E l e m e n t L o c a t e d ( ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' " + v a r 1 + " ' ] " ) ) ) ) ;  
 	 	 	  
 	 	 	 / / T h r e a d . s l e e p ( 3 0 0 0 ) ;  
 	 	 	  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " * * * * * * * * * * * * * * * * C l i c k i n g   o n   F i l e r o o m   f o r   " + v a r 1 + " * * * * * * * * * * * * * * * " ) ;  
 	 	 	  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' " + v a r 1 + " ' ] " ) ) . c l i c k ( ) ;  
 	 	 	  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " * * * * * * * * * * * * * * * * U p l o a d   f o r   " + v a r 1 + " * * * * * * * * * * * * * * * " ) ;  
 	 	 	 / *  
 	 	 	 T h r e a d . s l e e p ( 3 0 0 0 ) ;  
 	 	 	 / / w a i t . u n t i l ( E x p e c t e d C o n d i t i o n s . p r e s e n c e O f E l e m e n t L o c a t e d ( ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' U P L O A D ' ] " ) ) ) ) ;  
 	 	 	  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' U P L O A D ' ] " ) ) . c l i c k ( ) ;  
 	 	 	  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " * * * * * * * * * * * * * * * * B r o w s i n g   f i l e s   f r o m   d e s k t o p   f o r   " + v a r 1 + " * * * * * * * * * * * * * * * " ) ;  
 	 	 	  
 	 	 	  
 	 	 	 / *  
 	               / / T h r e a d . s l e e p ( 3 0 0 0 ) ;  
 	               w a i t . u n t i l ( E x p e c t e d C o n d i t i o n s . p r e s e n c e O f E l e m e n t L o c a t e d ( ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' B r o w s e ' ] " ) ) ) ) ;  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' B r o w s e ' ] " ) ) . c l i c k ( ) ;  
 	 	 	  
 	 	 	 T h r e a d . s l e e p ( 3 0 0 0 ) ;  
 	 	 	  
 	 	 	  
 	 	 	 R u n t i m e . g e t R u n t i m e ( ) . e x e c ( " C : \ \ U s e r s \ \ m o h i t k u m a r . s h a r m a \ \ D e s k t o p \ \ 1 0 0 B M P . e x e " ) ;  
 	 	 	  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " * * * * * * * * * * * * * * * * C o n t i n u e   f o r   " + v a r 1 + " * * * * * * * * * * * * * * * " ) ;  
 	 	 	  
 	 	 	 / / T h r e a d . s l e e p ( 8 0 0 0 ) ;  
 	 	 	 w a i t . u n t i l ( E x p e c t e d C o n d i t i o n s . p r e s e n c e O f E l e m e n t L o c a t e d ( ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' C o n t i n u e ' ] " ) ) ) ) ;  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' C o n t i n u e ' ] " ) ) . c l i c k ( ) ;  
 	 	 	 T h r e a d . s l e e p ( 3 0 0 0 ) ;  
 	 	 	 / / d r i v e r . s w i t c h T o ( ) . a c t i v e E l e m e n t ( ) ;  
 	 	 	 / / S y s t e m . o u t . p r i n t l n ( d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' C a n c e l ' ] / b u t t o n [ 1 ] " ) ) . g e t T e x t ( ) ) ;  
 	 	 	  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " * * * * * * * * * * * * * * * * U p l o a d   f o r   " + v a r 1 + " * * * * * * * * * * * * * * * " ) ;  
 	 	 	  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' U p l o a d ' ] " ) ) . c l i c k ( ) ;  
 	 	 	 l o n g   s t a r t T i m e   =   S y s t e m . c u r r e n t T i m e M i l l i s ( ) ;  
 	 	 	 / / T h r e a d . s l e e p ( 9 0 0 0 ) ;  
 	 	 	 w a i t . u n t i l ( E x p e c t e d C o n d i t i o n s . p r e s e n c e O f E l e m e n t L o c a t e d ( ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' F i n i s h ' ] " ) ) ) ) ;  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " * * * * * * * * * * * * * * * * F i n i s h   f o r   " + v a r 1 + " * * * * * * * * * * * * * * * " ) ;  
 	 	 	  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' F i n i s h ' ] " ) ) . c l i c k ( ) ;  
 	 	 	  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " * * * * * * * * * * * * * * * * P r o c e s s i n g   t i m e   c a l c u l a t i o n   f o r   " + v a r 1 + " * * * * * * * * * * * * * * * " ) ;  
 	 	 	 S t r i n g   f a i l e d t e x t = d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / s p a n [ t e x t ( ) = ' F a i l e d   F i l e s ' ] / / p r e c e d i n g : : s p a n [ 1 ] " ) ) . g e t T e x t ( ) ;  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " P r e v i o u s   f a i l e d   f i l e s :   " + f a i l e d t e x t ) ;  
 	 	 	 T h r e a d . s l e e p ( 3 0 0 0 ) ;  
 	 	 	  
 	 	 	 / / d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' " + v a r 1 + " ' ] " ) ) . c l i c k ( ) ;  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ @ n g - i f = ' g r i d . o p t i o n s . e n a b l e S e l e c t A l l ' ] " ) ) . c l i c k ( ) ;  
 	 	 	 T h r e a d . s l e e p ( 3 0 0 0 ) ;  
 	 	 	 / / w a i t . u n t i l ( E x p e c t e d C o n d i t i o n s . p r e s e n c e O f E l e m e n t L o c a t e d ( ( B y . x p a t h ( " . / / b u t t o n [ c o n t a i n s ( t e x t ( ) , ' M a r k   R e a d ' ) ] " ) ) ) ) ;  
 	 	 	  
 	 	 	 S t r i n g   s u c c e s s f i l e t e x t = d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / b u t t o n [ c o n t a i n s ( t e x t ( ) , ' M a r k   R e a d ' ) ] " ) ) . g e t T e x t ( ) ;  
 	 	 	  
 	 	 	 / / S y s t e m . o u t . p r i n t l n ( " s u c c e s s p r o c e s s   " + s u c c e s s f i l e t e x t ) ;  
 	 	 	  
 	 	 	  
 	 	 	 S t r i n g   t e x t = s u p p o r t . t e s t ( s u c c e s s f i l e t e x t ) ;  
 	 	 	 i n t   d =   I n t e g e r . p a r s e I n t ( t e x t ) ;  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " T o t a l   n o   o f   f i l e   u p l o a d e d   " + d ) ;  
 	 	 	 / / S y s t e m . o u t . p r i n t l n ( " t e x t   " + t e x t ) ;  
 	 	 	  
 	 	 	 i n t   c = 0 ;  
 	 	 	 w h i l e ( d + c ! =   1 0 0 )  
 	 	 	 {  
 	 	                 / / S y s t e m . o u t . p r i n t l n ( d ) ;  
 	 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' " + v a r 1 + " ' ] " ) ) . c l i c k ( ) ;  
 	 	 	 	 T h r e a d . s l e e p ( 2 0 0 0 ) ;  
 	 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ @ n g - i f = ' g r i d . o p t i o n s . e n a b l e S e l e c t A l l ' ] " ) ) . c l i c k ( ) ;  
 	 	 	 	 T h r e a d . s l e e p ( 2 0 0 0 ) ;  
 	 	 	 	 s u c c e s s f i l e t e x t = d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / b u t t o n [ c o n t a i n s ( t e x t ( ) , ' M a r k   R e a d ' ) ] " ) ) . g e t T e x t ( ) ;  
 	 	 	 	 t e x t = s u p p o r t . t e s t ( s u c c e s s f i l e t e x t ) ;  
 	 	 	 	 d =   I n t e g e r . p a r s e I n t ( t e x t ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " T o t a l   n o   o f   f i l e   u p l o a d e d   f o r   " + v a r 1 + "   " + d ) ;  
 	 	 	 	 / / S y s t e m . o u t . p r i n t l n ( " t e x t   i n   w h i l w l o o p   " + t e x t ) ;  
 	 	 	      
 	 	 	 	 S t r i n g   f a i l e d t e x t 1 = d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / s p a n [ t e x t ( ) = ' F a i l e d   F i l e s ' ] / / p r e c e d i n g : : s p a n [ 1 ] " ) ) . g e t T e x t ( ) ;  
 	 	 	 	 i n t   a , b ;  
  
 	 	 	 	 a =   I n t e g e r . p a r s e I n t ( f a i l e d t e x t ) ;  
 	 	 	 	 b =   I n t e g e r . p a r s e I n t ( f a i l e d t e x t 1 ) ;  
 	 	 	 	 c = b - a ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " T o t a l   f a i l e d   f i l e   d u r i n g   t h i s   u p l o a d   f o r   " + v a r 1 + " :   " + c ) ;  
 	 	 	 }  
  
 	 	 	 l o n g   e n d T i m e       =   S y s t e m . c u r r e n t T i m e M i l l i s ( ) ;  
 	 	 	 l o n g   t o t a l T i m e   =   e n d T i m e   -   s t a r t T i m e ;  
 	 	 	  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " T o t a l   P r o c e s s i n g   t i m e   i n   m i l l i s e c o n d   i s   f o r   " + v a r 1 + " :   " + t o t a l T i m e ) ;  
 	 	  
 	 	 	 l o n g   s e c o n d s   =   T i m e U n i t . M I L L I S E C O N D S . t o S e c o n d s ( t o t a l T i m e ) ;  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " T o t a l   P r o c e s s i n g   t i m e   i n   S e c o n d   i s   f o r   " + v a r 1 + " :   " + s e c o n d s ) ;  
 	 	 	 * /  
 	 	 }  
 	 	  
 	 	 @ A f t e r  
 	 	 p u b l i c   v o i d   a f t e r M e t ( )   t h r o w s   I n t e r r u p t e d E x c e p t i o n  
 	 	 {  
 	 	 	 / / d r i v e r . m a n a g e ( ) . t i m e o u t s ( ) . i m p l i c i t l y W a i t ( 5 ,   T i m e U n i t . S E C O N D S ) ;  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' " + v a r 1 + " ' ] " ) ) . c l i c k ( ) ;  
 	 	 	 T h r e a d . s l e e p ( 3 0 0 0 ) ;  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' M o v e   T o   T r a s h ' ] " ) ) . c l i c k ( ) ;  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ @ n g - c l i c k = ' d e l e t e C t r l . p r o c e s s C o n t e n t D e l e t e ( d e l e t e C t r l . i s P e r m a n e n t ) ' ] " ) ) . c l i c k ( ) ;  
 	 	 	 T h r e a d . s l e e p ( 5 0 0 0 ) ;  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' T r a s h ' ] " ) ) . c l i c k ( ) ;  
 	 	 	 w a i t . u n t i l ( E x p e c t e d C o n d i t i o n s . v i s i b i l i t y O f ( d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' E M P T Y   T R A S H ' ] " ) ) ) ) ;  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' E M P T Y   T R A S H ' ] " ) ) . c l i c k ( ) ;  
 	 	 	 T h r e a d . s l e e p ( 2 0 0 0 ) ;  
 	 	 	 d r i v e r . f i n d E l e m e n t ( B y . x p a t h ( " . / / * [ t e x t ( ) = ' D E L E T E ' ] " ) ) . c l i c k ( ) ;  
 	 	 	  
 	 	 }  
  
 }  
