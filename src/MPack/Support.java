 p a c k a g e   M P a c k ;  
  
 i m p o r t   j a v a . t e x t . D a t e F o r m a t ;  
 i m p o r t   j a v a . t e x t . S i m p l e D a t e F o r m a t ;  
 i m p o r t   j a v a . u t i l . C a l e n d a r ;  
 i m p o r t   j a v a . u t i l . r e g e x . M a t c h e r ;  
 i m p o r t   j a v a . u t i l . r e g e x . P a t t e r n ;  
  
 p u b l i c   c l a s s   S u p p o r t   {  
 	  
 	 p u b l i c   S t r i n g   t e s t ( S t r i n g   s e n t e n c e )   {  
  
 	               P a t t e r n   p a t t e r n   =   P a t t e r n . c o m p i l e ( " [ 0 - 9 ] + " ) ;  
 	               M a t c h e r   m a t c h e r   =   p a t t e r n . m a t c h e r ( s e n t e n c e ) ;  
  
 	               i f   ( m a t c h e r . f i n d ( ) )   {  
 	                       r e t u r n   m a t c h e r . g r o u p ( ) ;  
 	               }   e l s e   {  
 	                       r e t u r n   n u l l ;  
 	               }  
 	       }  
 	  
 	 p u b l i c   S t r i n g   t i m e C a l c u l a t i o n ( )  
 	 {  
 	 	 D a t e F o r m a t   d a t e F o r m a t   =   n e w   S i m p l e D a t e F o r m a t ( " m m s s " ) ;  
 	 	 C a l e n d a r   c a l   =   C a l e n d a r . g e t I n s t a n c e ( ) ;  
 	 	 S y s t e m . o u t . p r i n t l n ( d a t e F o r m a t . f o r m a t ( c a l . g e t T i m e ( ) ) ) ;  
 	 	 r e t u r n   d a t e F o r m a t . f o r m a t ( c a l . g e t T i m e ( ) ) ;  
 	 	  
 	 }  
  
 }  
